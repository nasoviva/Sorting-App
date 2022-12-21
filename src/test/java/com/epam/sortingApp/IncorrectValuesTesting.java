package com.epam.sortingApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class IncorrectValuesTesting {
    SortingApp sortingApp = new SortingApp();

    String in;

    public IncorrectValuesTesting(String in) {
        this.in = in;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> sortingApp() {
        return Arrays.asList(new Object[][]{
                {"0 a 1 3"},
                {" 1 2 3333333333333 5 5   "},
                {" 1 5 4 8 9 12  25 5 699 700 4 8 9 12  25 5 699 7 "},
                {" 1.5"}

        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectValues() {
        String[] args = in.trim().split(" ");
        sortingApp.sortValues(args);
    }
}
