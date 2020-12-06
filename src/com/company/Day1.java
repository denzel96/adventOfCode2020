package com.company;

import java.util.ArrayList;
import java.util.List;

public class Day1 extends Task {

    List<Integer> input;

    void parseInput() {
        input = new ArrayList<>();
        for (String line : getInput("day1.txt")) {
            input.add(Integer.parseInt(line));
        }
    }

    @Override
    public Integer getTask1Answer() {
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i) + input.get(j) == 2020) return input.get(i) * input.get(j);
            }
        }
        return null;
    }

    @Override
    public Integer getTask2Answer() {
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                for (int k = j + 1; k < input.size(); k++) {
                    if (input.get(i) + input.get(j) + input.get(k) == 2020)
                        return input.get(i) * input.get(j) * input.get(k);
                }
            }
        }
        return null;
    }
}
