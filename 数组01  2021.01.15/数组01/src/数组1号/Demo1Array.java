package 数组1号;

import java.math.MathContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Demo1Array {


    public static void main(String[] args) {
        int[] arry = new int[]{50,30,24,56,85,36};
        int []arr2;
        arr2=arry;
        String arry2 = "wang can";
        Random ran = new Random();
        int k = arry[ran.nextInt(6)];
        System.out.println(k);
        System.out.println(arry.length);
        System.out.println(arry2.length());
        System.out.println(arr2[1]);
        Arrays.sort(arr2);
        System.out.println(arr2[0]);
    }
}
