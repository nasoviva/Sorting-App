package com.epam.sortingApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortingAppTest {
    private SortingApp sortingApp = new SortingApp();


    @Test(expected = IllegalArgumentException.class)
    public void nullCaseException() {
        String[] in = null;
        sortingApp.sortValues(in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyArrayException() {
        String[] in = new String[0];
        sortingApp.sortValues(in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void moreThenTenValues() {
        String[] in = {"-2", "44", "5", "4", "0", "0", "5", "12", "57", "1666", "55"};
        sortingApp.sortValues(in);
    }

    @Test
    public void sortedValues() {
        String[] in = {"0", "1", "2", "3"};
        assertEquals("[0, 1, 2, 3]", sortingApp.sortValues(in));
    }

    @Test
    public void oneValue() {
        String[] in = {"0"};
        assertEquals("[0]", sortingApp.sortValues(in));
    }

    @Test
    public void tenValues() {
        String[] in = {"-2", "44", "5", "4", "0", "0", "5", "12", "57", "1666"};
        String expected = "[-2, 0, 0, 4, 5, 5, 12, 44, 57, 1666]";
        assertEquals(expected, sortingApp.sortValues(in));
    }
}
