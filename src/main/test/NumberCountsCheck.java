import com.stackroute.pe5.NumberCounts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberCountsCheck {
    NumberCounts numberCounts;
    @Before
    public void setUp() throws Exception {
        numberCounts = new NumberCounts();
    }

    @After
    public void tearDown() throws Exception {
        numberCounts = null;
    }

    //sucess case one
    @Test
    public void testNumberCountSuccess() {
        String input = "one one -one___two,,three,one @three*one?two four";
        Map<String, Integer> words = new HashMap<>();
        words.put("one",5);
        words.put("two",2);
        words.put("three",2);
        words.put("four",1);
        assertEquals(words,numberCounts.numberCount(input));
    }

    //failure case one
    @Test
    public void testNumberCountFailure() {
        String input = "one one -one___two,,three,one @three*one?two four";
        Map<String, Integer> words = new HashMap<>();
        words.put("one",5);
        words.put("two",2);
        words.put("three",2);
        assertNotEquals(words,numberCounts.numberCount(input));
    }
    //null case
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(numberCounts.numberCount(null));
    }
}