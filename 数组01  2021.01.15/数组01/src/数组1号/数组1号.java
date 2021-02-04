package 数组1号;

import java.util.Scanner;

public class 数组1号 {
    public static void main(String[] args) {
        System.out.println("输入录用人数：");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        //1.数据类型【】 数组名
        int[] arr1 = new int[]{11,22,33};
        System.out.println(arr1);
        //2.数据类型 数组名【】
         double arr2[] = {22,33};
        System.out.println(arr2);
    }
}
