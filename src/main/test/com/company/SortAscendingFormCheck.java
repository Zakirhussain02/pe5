package com.company;

import org.junit.After;
import com.company.SortInAscendingForm;
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






}
