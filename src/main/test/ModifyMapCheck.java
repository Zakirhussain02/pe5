import com.stackroute.pe5.ModifyMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class ModifyMapCheck
{

    ModifyMap modifyMap;
    @Before
    public void setUp() throws Exception {
        modifyMap=new ModifyMap();
    }

    @After
    public void tearDown() throws Exception {
        modifyMap=null;
    }

    //success case
    @Test
    public void testModifykeyValesSucess()
    {
        LinkedHashMap<String,String> expectedValue=new LinkedHashMap<>();
        LinkedHashMap<String,String> actualValue=new LinkedHashMap<>();
        LinkedHashMap<String,String> input=new LinkedHashMap<>();
        input.put("val1","java");
        input.put("val2","c++");
        expectedValue.put("val1"," ");
        expectedValue.put("val2","java");
        actualValue=modifyMap.ModifykeyValues(input);
        assertEquals(expectedValue,actualValue);
    }

    //failure case
    @Test
    public void testModifykeyValesFailure()
    {
        LinkedHashMap<String,String> expectedValue=new LinkedHashMap<>();
        LinkedHashMap<String,String> actualValue=new LinkedHashMap<>();
        LinkedHashMap<String,String> input=new LinkedHashMap<>();
        input.put("val1","java");
        input.put("val2","c++");
        expectedValue.put("val1","c++");
        expectedValue.put("val2","java");
        actualValue=modifyMap.ModifykeyValues(input);
        assertNotEquals(expectedValue,actualValue);
    }

//null case
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(modifyMap.ModifykeyValues(null));
    }



}