import com.stackroute.pe5.BooleanMap;
import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BooleanMapTest {
    BooleanMap booleanMap;
    @Before
    public void setUp() throws Exception {
        booleanMap = new BooleanMap();
    }

    @After
    public void tearDown() throws Exception {
        booleanMap = null;
    }

    @Test
    public void testNumberCountSuccess() {
        String[] input ={"a","b","c","d","a","c","c"};
        Map<String, Boolean> words = new HashMap<>();
        words.put("a",true);
        words.put("b",false);
        words.put("c",true);
        words.put("d",false);
        assertEquals(words,booleanMap.numberCount(input));
    }

    @Test
    public void testNumberCountFailure() {
        String[] input ={"a","b","c","d","a","c","c"};
        Map<String, Boolean> words = new HashMap<>();
        words.put("a",true);
        words.put("b",false);
        words.put("c",true);
        words.put("d",true);
        assertNotEquals(words,booleanMap.numberCount(input));
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(booleanMap.numberCount(null));
    }
}