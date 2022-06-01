package com.odebar.functional;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .limit(2)
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println(intSummaryStatistics);

        IntStream.range(0, 10)
                .forEach(System.out::println);

        IntStream.iterate(0, operand -> operand + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);
    }
}
