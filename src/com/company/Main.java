package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        System.out.println(new Day4().getTask1Answer());
        String  abbrev ="eyr";
        String line = "eyr:2021 hgt:168cm hcl:#fffffd pid:180778832 byr:1923 ecl:amb iyr:2019 cid:241";
        Pattern p = Pattern.compile("(.?)*byr:\\d{4}([^\\s]+)(.)*");
        Matcher m = p.matcher(line);
        m.matches();
        System.out.println(m.group(2));
    }
}

