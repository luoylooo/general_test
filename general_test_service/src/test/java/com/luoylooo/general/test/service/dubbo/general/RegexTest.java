package com.luoylooo.general.test.service.dubbo.general;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    @Test
    public void patternSplitTest() {
        Pattern pattern = Pattern.compile("\\s*[,]+\\s*");
        String input = "ab_,12,sdf";
        String[] strs = pattern.split(input);
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
