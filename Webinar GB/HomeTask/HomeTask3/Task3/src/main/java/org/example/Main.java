package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 8, 0, 2, 5, 1, 4, 7, 6, 9);
    }
    public static List<Integer> mergeSort(List<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }

        int half = array.size() / 2;
        List<Integer> leftList = array.subList(0, half);
        List<Integer> rightList = array.subList(half, array.size());

        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);

        return merge(leftList, rightList);
    }

}
