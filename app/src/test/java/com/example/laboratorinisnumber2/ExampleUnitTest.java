package com.example.laboratorinisnumber2;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.laboratorinisnumber2.utils.TextUtils;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    //getWordsCount testavimas
    @Test
    public void getWordsCount_result_isCorrect() {
        //ivedamas normalus tekstas
        int res = TextUtils.getWordsCount("Laba diena");
        assertEquals(2, res);

        res = TextUtils.getWordsCount("Siandien grazi diena");
        assertEquals(3, res);

        //ivedamas tekstas su tarpais
        res = TextUtils.getWordsCount(" Labas  ");
        assertEquals(1, res);

        //ivedami tik tarpai
        res = TextUtils.getWordsCount("    ");
        assertEquals(0, res);

        //nieko neivedama
        res = TextUtils.getWordsCount("");
        assertEquals(0, res);
    }

    //getCharsCount testavimas
    @Test
    public void getCharsCount_result_isCorrect() {
        //ivedamos bet kokios raides
        int res = TextUtils.getCharsCount("hjkiop");
        assertEquals(6, res);

        //ivedami bet kokie skaiciai
        res = TextUtils.getCharsCount("123456789");
        assertEquals(9, res);

        //ivedami tik tarpai
        res = TextUtils.getCharsCount("   ");
        assertEquals(3, res);

        //nieko neivedama
        res = TextUtils.getCharsCount("");
        assertEquals(0, res);

        //ivedami ivairus zenklai
        res = TextUtils.getCharsCount("./';,ssac23");
        assertEquals(11, res);
    }

    //getCharsNoSpaceCount
    @Test
    public void getCharsNoSpaceCount_result_isCorrect() {
        //nieko neivedama
        int res = TextUtils.getCharsNoSpaceCount("");
        assertEquals(0, res);

        //ivedami tik tarpai
        res = TextUtils.getCharsNoSpaceCount("   ");
        assertEquals(0, res);

        //ivedamas tekstas su tarpais
        res = TextUtils.getCharsNoSpaceCount("laba diena viso gero");
        assertEquals(17, res);

        //ivedami zenklai ir zodziai su tarpais
        res = TextUtils.getCharsNoSpaceCount("laba /;' diena ?!@");
        assertEquals(15, res);
    }
}