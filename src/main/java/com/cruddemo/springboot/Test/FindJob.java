package com.cruddemo.springboot.Test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class FindJob {
    /**每个输入包含一个测试用例。
    每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
    接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
    接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
    保证不存在两项工作的报酬相同。

     3 3
     1 100
     10 1000
     1000000000 1001
     9 10 1000000000

     100
     1000
     1001
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][2]; //Use the ability and salary of the job create two-dimension array
        TreeMap map = new TreeMap();
        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (e1, e2) -> (int)(e1[0] - e2[0])); //sort the array by ability
        for(int i = 1; i < arr.length; i++) {
            arr[i][1] = Math.max(arr[i-1][1], arr[i][1]);
            /**冒泡排序法将能力最高和能力次高的项中对应薪水最高的项前置，最后的
             结果就是前面第一位肯定是薪水最高的*/
        }
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i][0], arr[i][1]); //将能力和薪水做map映射
        }
        for(int i = 0; i < M; i++) {
            int ability = sc.nextInt();
            Integer index = (Integer) map.floorKey(ability); //取小于等于该应聘者能力的最接近的key，也就是不超过他能力对应的最高薪水
            if(index != null) {
                System.out.println(map.get(index));
            } else {
                System.out.println(0);
            }
        }

    }
}
