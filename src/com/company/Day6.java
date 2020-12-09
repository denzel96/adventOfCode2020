package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day6 extends Task {
    ArrayList<String> input;

    @Override
    void parseInput() {
        input = getInput("day6.txt");
    }

    @Override
    Object getTask1Answer() {
        differentChars("asd");
        for (String line : input) {
        }
        return "getTask1Answer";
    }

    @Override
    Object getTask2Answer() {
        return null;
    }

    int differentChars(String line) {
        List.of(line.toCharArray()).stream().map(key -> 1).count();
        System.out.println(asd);
        return 0;
    }
}
