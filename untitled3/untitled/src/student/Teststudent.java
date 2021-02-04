package student;

import javax.swing.*;

public class Teststudent {
    public static void main(String[] args) {
        students stu = new students();
        JFrame frame = new JFrame();
        System.out.println(stu);

        System.out.println(stu.name);
        System.out.println(stu.age);
    }
}
