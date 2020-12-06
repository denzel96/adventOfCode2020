package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Task {
    abstract void parseInput();

    abstract Object getTask1Answer();

    abstract Object getTask2Answer();

    public Task() {
        parseInput();
    }

    static List<String> getInput(String fileName) {
        List<String> result = null;
        try (Stream<String> lines = Files.lines(Paths.get("src/com/inputs/" + fileName))) {
            result = lines.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    void showTask1Answer() {
        System.out.println(getTask1Answer());
    }

    void showTask2Answer() {
        System.out.println(getTask2Answer());
    }


}
