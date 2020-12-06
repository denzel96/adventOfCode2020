package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2 extends Task {
    List<String> input;

    @Override
    void parseInput() {
        input = getInput("day2.txt");
    }

    @Override
    public Object getTask1Answer() {
        List<InputWrapper> inputWrappers = new ArrayList<>();
        for (String s : input) {
            inputWrappers.add(new InputWrapper(s));
        }
        int count = 0;
        for (InputWrapper i : inputWrappers) {
            if (i.isVaildOldPw()) count++;
        }
        return count;
    }

    @Override
    public Object getTask2Answer() {
        List<InputWrapper> inputWrappers = new ArrayList<>();
        for (String s : input) {
            inputWrappers.add(new InputWrapper(s));
        }
        int count = 0;
        for (InputWrapper i : inputWrappers) {
            if (i.isVaildNewPw()) count++;
        }
        return count;
    }

    static class InputWrapper {
        Integer min;
        Integer max;
        char c;
        String pw;

        public InputWrapper(String line) {
            Pattern p = Pattern.compile("(\\d+)-(\\d+) (\\w): (\\w*)");
            Matcher m = p.matcher(line);
            m.matches();
            this.min = Integer.parseInt(m.group(1));
            this.max = Integer.parseInt(m.group(2));
            this.c = m.group(3).toCharArray()[0];
            this.pw = m.group(4);
        }

        boolean isVaildOldPw() {
            int count = 0;
            for (int i = 0; i < pw.length(); i++) {
                if (pw.toCharArray()[i] == c) count++;
            }
            return count >= min && count <= max;
        }

        public boolean isVaildNewPw() {
            return pw.toCharArray()[min - 1] == c ^ pw.toCharArray()[max - 1] == c;
        }

        public String toString() {
            return min + "-" + max + " " + c + ": " + pw;
        }
    }
}
