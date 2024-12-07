package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Основной класс для тестирования производительности ArrayList и LinkedList.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Performance Test:");
        runPerformanceTest(new ArrayList<>(), "ArrayList");
        runPerformanceTest(new LinkedList<>(), "LinkedList");
    }

    /**
     * Запускает тест производительности для указанного списка.
     *
     * @param list    список для тестирования (ArrayList или LinkedList)
     * @param listType тип списка (например, "ArrayList" или "LinkedList")
     */
    public static void runPerformanceTest(List<Person> list, String listType) {
        int iterations = 100000;

        System.out.println("\nTesting " + listType + ":\n");

        // Тестирование метода add
        long addStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(new Person("Person " + i, 30, "Department " + (i % 5)));
        }
        long addEnd = System.nanoTime();
        System.out.println("Add: " + (addEnd - addStart) + " ns");

        // Тестирование метода get
        long getStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.get(i);
        }
        long getEnd = System.nanoTime();
        System.out.println("Get: " + (getEnd - getStart) + " ns");

        // Тестирование метода remove
        long deleteStart = System.nanoTime();
        for (int i = iterations - 1; i >= 0; i--) {
            list.remove(i);
        }
        long deleteEnd = System.nanoTime();
        System.out.println("Delete: " + (deleteEnd - deleteStart) + " ns");
    }
}