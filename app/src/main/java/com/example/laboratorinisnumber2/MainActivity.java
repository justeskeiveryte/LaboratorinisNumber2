package com.example.laboratorinisnumber2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laboratorinisnumber2.utils.TextUtils;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txtMain;
    Spinner spOptionSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult=findViewById(R.id.tvResult);
        this.txtMain = findViewById(R.id.txtMain);
        this.spOptionSelection = findViewById(R.id.spOptionSelection);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptionSelection.setAdapter(adapter);
    }

    public int onBtnCalculateClick(View view) {

        if(!Objects.equals(this.txtMain.getText().toString(),"")){

            if(this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase("Words")){

                int wordsCount;
                wordsCount = TextUtils.getWordsCount(this.txtMain.getText().toString());
                this.tvResult.setText(Integer.toString(wordsCount));

            }
            else if (this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase("Chars")){

                int charsNoSpaceCount;
                charsNoSpaceCount = TextUtils.getCharsNoSpaceCount(this.txtMain.getText().toString());
                String charsCountFormatted = String.valueOf(charsNoSpaceCount);
                this.tvResult.setText(charsCountFormatted);

            }
            else if (this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase("Chars and Spaces")){

                int charsCount;
                charsCount = TextUtils.getCharsCount(this.txtMain.getText().toString());
                String charsCountFormatted = String.valueOf(charsCount);
                this.tvResult.setText(charsCountFormatted);

            }
        }
        else{

            Toast.makeText(this,getString(R.string.NoText), Toast.LENGTH_LONG).show();

        }
        return 0;
    }

}