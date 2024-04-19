package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Comparator<String> comparator = new ListComparator();

        // Сортируем список с использованием компаратора
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = computeFunctionValue(a);
        int bValue = computeFunctionValue(b);

        // Сравниваем значения функции
        if (aValue != bValue) {
            return Integer.compare(aValue, bValue);
        } else {
            // Если значения функции равны, сортируем элементы как строки
            return a.compareTo(b);
        }

    }
    private int computeFunctionValue(String s) {
        int x = Integer.parseInt(s);
        return 5 * x * x + 3;
    }
}
