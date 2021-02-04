package 窗口1号;

import javax.swing.*;

public class JLabel01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("java学习平台");
        frame.setLocationRelativeTo(null);
        frame.setSize(1200,1200);
        frame.setDefaultCloseOperation(3);

        //取消默认布局
        frame.setLayout(null);


        ImageIcon con = new ImageIcon("C:\\Users\\DELL\\Pictures\\Saved Pictures\\Camera Roll\\32.jpg");
        //创建JLabel对象，显示文本
        JLabel jill = new JLabel("长裙");
        jill.setBounds(50,50,100,100);
        //创建JLabel对象，显示图片
        JLabel jill1 = new JLabel(con);
        jill1.setBounds(100,100,263,400);
        //将JLabel对象添加到面板中
        frame.getContentPane().add(jill);
        frame.getContentPane().add(jill1);
        frame.setAlwaysOnTop(true);
    }
}
