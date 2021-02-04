package 窗口1号;

import javax.swing.*;

public class 窗口学习第一天 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("java学习平台");
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(3);

        //取消默认布局
        frame.setLayout(null);

        //创建按钮对象
        JButton btn = new JButton("关闭窗口~");
        btn.setBounds(50,50,100,100);
        //通过窗口对象，获取到面板对象，并调用add方法添加按钮组件
        frame.getContentPane().add(btn);
        frame.setAlwaysOnTop(true);
    }
}
