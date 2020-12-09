package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day5 extends Task {
    ArrayList<String> input;

    @Override
    void parseInput() {
        input = getInput("day5.txt");
    }

    @Override
    Object getTask1Answer() {
        List<Integer> asd = new ArrayList<>();
        input.forEach(
                s -> asd.add(getSeatId(getRowAndCol(s)[0], getRowAndCol(s)[1]))
        );
        return Collections.max(asd);
    }

    @Override
    Object getTask2Answer() {
        return null;
    }

    int search(char[] chars, double low, double high) {
        double mid = (high - low) / 2 + low;
        for (char c : chars) {
            if (c == 'F' || c == 'L') high = Math.floor(mid);
            if (c == 'B' || c == 'R') low = Math.ceil(mid);
            mid = (high - low) / 2 + low;
        }
        return (int) mid;
    }

    int getSeatId(int row, int col) {
        return row * 8 + col;
    }

    int[] getRowAndCol(String input) {
        char[] rows = new char[7];
        char[] cols = new char[3];
        input.getChars(0, 7, rows, 0);
        input.getChars(7, 10, cols, 0);

        int row = search(rows, 0, 127);
        int col = search(cols, 0, 7);

        return new int[]{row, col};
    }
}
