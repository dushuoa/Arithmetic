package com.atguigu.arithmetic.sort;

/**
 * @Author dushuo
 * @Date 2022/6/30 14:56
 * @Version 1.0
 * 冒泡排序算法
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));

        bubbleSort(data);

        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));

    }

    //冒泡排序算法
    private static void bubbleSort(int[] data) {
        int length = data.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-1; j++) {
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
