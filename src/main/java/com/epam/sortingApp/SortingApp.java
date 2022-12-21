package com.epam.sortingApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingApp {

    public String sortValues(String[] args) throws IllegalArgumentException {
        List<Integer> array;
        String str;
        int count;
        if (args == null || args.length < 1 || args.length > 10) {
            throw new IllegalArgumentException();
        }
        array = new ArrayList<>();
        count = 0;
        try {
            for (String s : args) {
                if (count < 10) {
                    array.add(Integer.parseInt(s));
                    count++;
                }
            }
            Collections.sort(array);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
        str = Arrays.toString(array.toArray());
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        SortingApp sortingApp = new SortingApp();
        try {
            sortingApp.sortValues(args);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }
}

