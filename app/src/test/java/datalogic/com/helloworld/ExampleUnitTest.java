package datalogic.com.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, CreateUserActivity.somma(2,2));
    }

    @Test
    public void multiply_isCorrect() {
        assertEquals(16, CreateUserActivity.moltiplica(4,4));
    }

    @Test
    public void failed_dummy_test() {
        assertEquals("123", "1234");
    }
}