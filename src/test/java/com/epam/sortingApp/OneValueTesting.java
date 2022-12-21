package com.epam.sortingApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class OneValueTesting {
    SortingApp sortingApp = new SortingApp();

    String in;
    String expected;

    public OneValueTesting(String in, String expected) {
        this.in = in;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> sortingApp() {
        return Arrays.asList(new Object[][]{
                {"0", "[0]"},
                {"  1   ", "[1]"},
                {" 2", "[2]"},
                {"5 ", "[5]"}

        });
    }

    @Test
    public void testOneValue() {
        String[] args = in.trim().split(" ");
        assertEquals(expected, sortingApp.sortValues(args));
    }
}
