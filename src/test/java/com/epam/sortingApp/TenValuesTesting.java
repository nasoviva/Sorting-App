package com.epam.sortingApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TenValuesTesting {
    SortingApp sortingApp = new SortingApp();

    String in;
    String expected;

    public TenValuesTesting(String in, String expected) {
        this.in = in;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> sortingApp() {
        return Arrays.asList(new Object[][]{
                {"-1 0 1 5 55 9 1000 2 3 -2", "[-2, -1, 0, 1, 2, 3, 5, 9, 55, 1000]"},
                {"1 16 2  15 35 7 7 7 5 81 ", "[1, 2, 5, 7, 7, 7, 15, 16, 35, 81]"},
                {"-2 44 5 4 0 0 5 12 57 1666   ", "[-2, 0, 0, 4, 5, 5, 12, 44, 57, 1666]"},
                {" 1 5 4 8 9 12  25 5 699 700  ", "[1, 4, 5, 5, 8, 9, 12, 25, 699, 700]"}

        });
    }

    @Test
    public void testTenValues() {
        String[] args = in.trim().split("\\s+");
        assertEquals(expected, sortingApp.sortValues(args));
    }
}
