package com.css.me;

import java.util.ArrayList;

public class CssBinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int key = 2;
        System.out.println(rank(array, key));
        new ArrayList<>();
    }

    /**
     * 性能 n/2
     * @param array 已知的有序数组
     * @param key   要查找的数字
     * @return 在有序数组的位置索引，没有返回-1
     */
    private static int rank(int[] array, int key) {
        int head = 0;
        int tail = array.length - 1;
        while (head <= tail) {
            int middleIndex = head + (tail - head) / 2;
            if (array[middleIndex] == key) {
                return middleIndex;
            } else if (array[middleIndex] < key) {
                head = middleIndex + 1;
            } else if (array[middleIndex] > key) {
                tail = middleIndex - 1;
            }
            System.out.println("head:" + head + " tail:" + tail + " middle" + middleIndex);
        }
        return -1;
    }
}
