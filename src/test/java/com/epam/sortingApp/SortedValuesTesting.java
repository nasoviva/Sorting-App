package com.epam.sortingApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SortedValuesTesting {
    SortingApp sortingApp = new SortingApp();

    String in;
    String expected;

    public SortedValuesTesting(String in, String expected) {
        this.in = in;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> sortingApp() {
        return Arrays.asList(new Object[][]{
                {"0 1 2 3", "[0, 1, 2, 3]"},
                {"1 2   3 5", "[1, 2, 3, 5]"},
                {"-2 5  ", "[-2, 5]"},
                {" 5 699 700  ", "[5, 699, 700]"}

        });
    }

    @Test
    public void testSortedValues() {
        String[] args = in.trim().split("\\s+");
        assertEquals(expected, sortingApp.sortValues(args));
    }
}
