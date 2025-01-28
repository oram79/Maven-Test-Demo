package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassToTestTest {

    @Test
    public void testMethodToTest() {
        ClassToTest objectUnderTest = new ClassToTest();

        List<String> listOfStrings = objectUnderTest.methodToTest("test");

        Assertions.assertTrue(listOfStrings.contains("test"));
        Assertions.assertEquals(listOfStrings.size(), 1);

        listOfStrings = objectUnderTest.methodToTest("test");

        Assertions.assertEquals(listOfStrings.size(), 1);

        listOfStrings = objectUnderTest.methodToTest("Test");

        Assertions.assertEquals(listOfStrings.size(), 1);

        listOfStrings = objectUnderTest.methodToTest("Testing");

        Assertions.assertEquals(listOfStrings.size(), 2);

        Assertions.assertTrue(listOfStrings.contains("test"));
        Assertions.assertTrue(listOfStrings.contains("testing"));
    }
}