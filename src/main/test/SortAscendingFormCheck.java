import com.stackroute.pe5.SortInAscendingForm;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortAscendingFormCheck {
    SortInAscendingForm sortTheNames;
    @Before
    public void setUp() throws Exception {
        sortTheNames=new SortInAscendingForm();
    }

    @After
    public void tearDown() throws Exception {
        sortTheNames=null; }

        //success case one
    @Test
    public void testSortTheNamesSuccess() {
        Set<String> inputList = new HashSet<String>();
        inputList.add("Harry");
        inputList.add("Olive");
        inputList.add("Alice");
        inputList.add("Bluto");
        ArrayList<String> actualValue=new ArrayList<>();
        ArrayList<String> expectedValue=new ArrayList<>();
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Harry");
        expectedValue.add("Olive");
        actualValue=sortTheNames.sortAscending((HashSet<String>) inputList);
        assertEquals(expectedValue,actualValue);
    }

    //failure case one
    @Test
    public void testSortTheNamesFailure() {
        Set<String> inputList = new HashSet<String>();
        inputList.add("Harry");
        inputList.add("Olive");
        inputList.add("Alice");
        inputList.add("Bluto");
        ArrayList<String> actualValue=new ArrayList<>();
        ArrayList<String> expectedValue=new ArrayList<>();
        expectedValue.add("bluto");
        expectedValue.add("Bluto");
        expectedValue.add("Bluto");
        expectedValue.add("Harry");
        expectedValue.add("Olive");
        actualValue=sortTheNames.sortAscending((HashSet<String>) inputList);
        assertNotEquals(expectedValue,actualValue);
    }

    //success cases two
    @Test
    public void testSortTheNamesSuccessOne() {
        Set<String> inputList = new HashSet<String>();
        inputList.add("Zakir");
        inputList.add("Uday");
        inputList.add("Santosh");
        inputList.add("Amit");
        ArrayList<String> actualValue=new ArrayList<>();
        ArrayList<String> expectedValue=new ArrayList<>();
        expectedValue.add("Amit");
        expectedValue.add("Santosh");
        expectedValue.add("Uday");
        expectedValue.add("Zakir");
        actualValue=sortTheNames.sortAscending((HashSet<String>) inputList);
        assertEquals(expectedValue,actualValue);
    }




}
