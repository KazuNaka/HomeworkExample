import org.junit.Test;

import static org.junit.Assert.*;

public class Nakashima_TwoStringMethodsTest {



    @Test
    public void abcTest1() {
        boolean result = Nakashima_TwoStringMethods.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = Nakashima_TwoStringMethods.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = Nakashima_TwoStringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4() {
        boolean result = Nakashima_TwoStringMethods.abcTest("");
        assertEquals(false, result);
    }


    @Test
    public void alternateStirngs1() {
        String word = Nakashima_TwoStringMethods.alternateStirngs("abc", "xyz");
        assertEquals("axbycz", word);
    }

    @Test
    public void alternateStirngs2() {
        String word = Nakashima_TwoStringMethods.alternateStirngs("Hi", "There");
        assertEquals("HTihere", word);
    }

    @Test
    public void alternateStirngs3() {
        String word = Nakashima_TwoStringMethods.alternateStirngs("xxxx", "Thereee");
        assertEquals("xTxhxexreee", word);
    }

    @Test
    public void alternateStirngs4() {
        String word = Nakashima_TwoStringMethods.alternateStirngs("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", word);
    }

    @Test
    public void alternateStirngs5() {
        String word = Nakashima_TwoStringMethods.alternateStirngs("", "");
        assertEquals("", word);
    }


}