package com.odebar.multithreading.jfe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnaryActionMain {
    public static void main(String[] args) {
        List<Double> numbers = IntStream.range(1, 1_000_000)
                .asDoubleStream()
                .boxed()
                .parallel()
                .peek(n -> System.out.printf("%5.2f; ", n))
                .collect(Collectors.toList());
        new UnaryAction<>(numbers, d -> Math.sqrt(d)).invoke();
        numbers.stream().forEach(r -> System.out.printf("%7.4f %n ", r));
    }
}
