package org.example;

import java.util.*;
import java.util.stream.*;
import java.util.AbstractMap.SimpleEntry;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble optionalAverage = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optionalAverage.isPresent()) {
            double average = optionalAverage.getAsDouble();
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("Список пустой");
        }

        // Задача 2
        List<String> strings = Arrays.asList("one", "two", "three");
        List<SimpleEntry<String, String>> result = strings.stream()
                .map(s -> new SimpleEntry<>(s, s.toUpperCase())).toList();
        System.out.println("Преобразованный список: " + result);

        // Задача 3
        List<String> stringsToFilter = Arrays.asList("test", "four", "five", "longer");
        List<String> filteredStrings = stringsToFilter.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase())).toList();
        System.out.println("Отфильтрованный список: " + filteredStrings);
    }
}