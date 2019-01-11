import com.stackroute.pe5.UpdateArray;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayCheck {

    private UpdateArray updateArray;

    @Before
    public void setUp() {
        updateArray =new UpdateArray();

    }
    //success case for updating array
    @Test
    public void UpdateArraySuccess(){
        List<String>  expectedList=new ArrayList<>();
        List<String> listOfStrings=new ArrayList<>();
        expectedList.add("kiwi");
        expectedList.add("watermelon");
        expectedList.add("Mango");
        expectedList.add("Pineapple");
        listOfStrings.add("Apple");
        listOfStrings.add("watermelon");
        listOfStrings.add("Mango");
        listOfStrings.add("Pineapple");

        assertEquals(expectedList,updateArray.upDateList(listOfStrings,"Apple","kiwi"));
    }
    //failure case for updating array
    @Test
    public void UpdateArrayFailure(){
        List<String>  expectedList=new ArrayList<>();
        List<String> listOfStrings=new ArrayList<>();
        expectedList.add("Apple");
        expectedList.add("watermelon");
        expectedList.add("Mango");
        expectedList.add("Pineapple");
        listOfStrings.add("kiwi");

        assertEquals(new ArrayList<>(),updateArray.upDateList(listOfStrings,"Apple","kiwi"));
    }

    //failure cases
    @Test
    public void UpdateArrayFailureOne(){
        List<String>  expectedList=new ArrayList<>();
        List<String> listOfStrings=new ArrayList<>();
        expectedList.add("kiwi");
        expectedList.add("watermelon");
        expectedList.add("Mango");
        //expectedList.add("Pineapple");
        listOfStrings.add("Apple");
        listOfStrings.add("watermelon");
        listOfStrings.add("Mango");
        listOfStrings.add("Pineapple");

        assertNotEquals(expectedList,updateArray.upDateList(listOfStrings,"Apple","kiwi"));
    }
}