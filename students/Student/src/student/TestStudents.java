package student;

import java.util.Scanner;

public class TestStudents {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("输入学生的个数：");
        int k = scan1.nextInt();
        students []stu1 = new students[k];
        for(int i=0; i<k;i++) {
            Scanner scan = new Scanner(System.in);
            stu1[i].setName(scan1.nextLine());
            stu1[i].setAge(scan1.nextInt());
            }
        for( int i=0; i<k; i++){
            System.out.println(stu1[i].getName()+"------"+stu1[i].getAge());
        }
        }
    }
