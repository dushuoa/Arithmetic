package com.atguigu.arithmetic.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dushuo
 * @Date 2022/6/30 16:09
 * @Version 1.0
 */
public class BinarySearch2 {
    public static void main(String[] args) {
        //注意：需要对已排序的数组进行二分查找
        int[] data = {1, 8, 10, 89, 1000, 1000, 1234};
        List<Integer> list = binarySearch2(data, 0, data.length, 1000);
        System.out.println(list);

    }

    /**
    * {1, 8, 10, 89, 1000, 1000, 1234}
    * 一个有序数组中，有多个相同的数值，如何将所有的数值都查找到，比如这里的 1000.
    * 分析：
    * 1. 返回的结果是一个列表 list
    * 2. 在找到结果时，向左边扫描，向右边扫描 [条件]
    * 3. 找到结果后，就加入到ArrayBuffer
    *
    * @return
    */
    private static List<Integer> binarySearch2(int[] data, int left, int right, int finalVal) {
        List<Integer> result = new ArrayList<>();

        //定义中间变量
        int binary = (left + right)/2;

        if(finalVal < data[binary]){
            return binarySearch2(data,left,binary,finalVal);
        }else if(finalVal > data[binary]){
            return binarySearch2(data,binary,right,finalVal);
        }else {
            System.out.println("查找到的索引是："+binary);
            result.add(binary);

            //查看这个索引的左边
            int leftBinary = binary-1;
            while (true) {
                if(leftBinary < 0 || data[leftBinary] != finalVal){
                    break;
                }
                if (data[leftBinary] == finalVal) {
                    result.add(leftBinary);
                }
                leftBinary --;
            }

            int rightBinary = binary+1;
            while (true){
                if(data[rightBinary] != finalVal){
                    break;
                }else {
                    result.add(rightBinary);
                }
                rightBinary ++;
            }
        }

        return result;
    }
}
