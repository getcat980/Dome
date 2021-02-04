package 图像练习1号;

import java.util.Scanner;

public class java练习题1天 {
    private static Math math;

    public static void main(String[] args) {
        java练习题1天类方法 name = new java练习题1天类方法();
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月数：");
        n = scan.nextInt();
        if(n==1||n==2){
            System.out.println("1");
        }
        else if(n==3){
            System.out.println("2");
        }
        else {
            n=n-2;
            System.out.println(name.shuLiang2(n));
        }
    }
}
