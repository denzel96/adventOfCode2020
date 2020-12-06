package com.company;

import java.util.List;

public class Day3 extends Task {

    List<String> input;

    @Override
    void parseInput() {
        input = getInput("day3.txt");
    }

    Integer lineWidth = input.get(0).length();
    Integer bottom = input.size();

    public Integer play(Integer right, Integer down) {
        Coord c = new Coord(0, 0);
        int count = 0;
        while (c.isNotBottom()) {
            c.add(right, down);
            if (c.isNotBottom() && isTree(c)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Object getTask1Answer() {
        return play(3, 1);
    }

    @Override
    public Object getTask2Answer() {
        return (long) play(1, 1) * play(3, 1) * play(5, 1) * play(7, 1) * play(1, 2);
    }

    class Coord {
        Integer x = 0;
        Integer y = 0;

        public Coord(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public void add(Integer addX, Integer addY) {
            x += addX;
            y += addY;
        }

        public boolean isNotBottom() {
            return y < bottom;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    boolean isTree(Coord c) {
        return input.get(c.y).toCharArray()[(c.x) % lineWidth] == '#';
    }
}
