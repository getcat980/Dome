package 图像练习1号;

import java.util.Scanner;

public class 图像练习1天 {
    public static void main(String[] args) {
        int k;
        System.out.println("请输入三角形层数：");
        Scanner scan = new Scanner (System.in);
        k = scan.nextInt();
        //1.直角三角形
        /*for(int i=0; i<k; i++){
            for(int l=0; l<=i; l++){
                System.out.print("*");
            }
            System.out.print('\n');
        }*/
        //2.等腰三角形 适用于：奇数
        for(int i=0; i<k ;i++){
            for(int l=i; l<k-1; l++){
                System.out.print(" ");
            }
            for(int j=0; j<(i*2+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
