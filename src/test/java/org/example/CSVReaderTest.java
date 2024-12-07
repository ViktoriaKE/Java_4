package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для тестирования производительности ArrayList и LinkedList с использованием JUnit.
 */
public class CSVReaderTest {
    /**
     * Тест производительности ArrayList.
     */
    @Test
    public void testArrayListPerformance() {
        long[] results = runPerformanceTest(new ArrayList<>());
        assertTrue(results[0] > 0, "Add should complete successfully");
        assertTrue(results[1] > 0, "Get should complete successfully");
        assertTrue(results[2] > 0, "Delete should complete successfully");
    }

    /**
     * Тест производительности LinkedList.
     */
    @Test
    public void testLinkedListPerformance() {
        long[] results = runPerformanceTest(new LinkedList<>());
        assertTrue(results[0] > 0, "Add should complete successfully");
        assertTrue(results[1] > 0, "Get should complete successfully");
        assertTrue(results[2] > 0, "Delete should complete successfully");
    }

    /**
     * Выполняет тест производительности для указанного списка.
     *
     * @param list список для тестирования
     * @return массив времени выполнения для операций add, get и remove
     */
    private long[] runPerformanceTest(List<Person> list) {
        int iterations = 100000;
        long[] timings = new long[3];

        // Тестирование метода add
        long addStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(new Person("Person " + i, 30, "Department " + (i % 5)));
        }
        long addEnd = System.nanoTime();
        timings[0] = addEnd - addStart;

        // Тестирование метода get
        long getStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.get(i);
        }
        long getEnd = System.nanoTime();
        timings[1] = getEnd - getStart;

        // Тестирование метода remove
        long deleteStart = System.nanoTime();
        for (int i = iterations - 1; i >= 0; i--) {
            list.remove(i);
        }
        long deleteEnd = System.nanoTime();
        timings[2] = deleteEnd - deleteStart;

        return timings;
    }
}