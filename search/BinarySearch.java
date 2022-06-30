package com.atguigu.arithmetic.search;


/**
 * @Author dushuo
 * @Date 2022/6/30 15:54
 * @Version 1.0
 *
 * 二分法查找
 */
public class BinarySearch {

    public static void main(String[] args){
        //注意：需要对已排序的数组进行二分查找
        int[] data = {-49, -30, -16, 9, 21, 21, 23, 30, 30};
        int i = binarySearch(data, 0, data.length, -16);
        System.out.println(i);
    }

    /**
   	 * 二分查找 时间复杂度O(log2n);空间复杂度O(1)
   	 *
   	 * @param arr     被查找的数组
   	 * @param left
   	 * @param right
   	 * @param findVal 要查找的数
   	 * @return 返回元素的索引
   	 */
    public static Integer binarySearch(int[] arr, int left, int right, int findVal){
        if(left > right){
            return -1;
        }

        int binary = 0;
        while (left < right){
            binary = (right+left)/2;
            if(findVal<arr[binary]){
                right = binary;
            }
            if(findVal > arr[binary]){
                left = binary;
            }
            if(findVal == arr[binary]){
                break;
            }
        }
        return binary;
    }

}
