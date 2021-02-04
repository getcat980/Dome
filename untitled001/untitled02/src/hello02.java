import javax.swing.JFrame;

public class hello02 {
    private static Math math;

    public static void main(String[] args) {
        System.out.println("90度的正弦值："+math.sin(math.PI/2));
        System.out.println("60度的余弦值 "+math.cos(math.PI/3));
        System.out.println("45度的正切值 "+math.tan(math.PI/4));
        System.out.println("45度的反正切值 "+math.atan(math.PI/4));
        System.out.println("90度的角度值 "+math.toDegrees(math.PI/2));
        float a;
        Integer x = 99;
        Integer b = 20;
        String f = "16";
        a = x.floatValue();
        System.out.println(a);
        System.out.println(x.compareTo(b));
        System.out.println(Integer.valueOf(f,8));
        System.out.println(Float.toString(25.0f));
        System.out.println(Integer.parseInt(f,8));
        System.out.println(math.exp(20));
        Character zhi[] = {'a','7'};
        Integer c = 300;
        Integer d = 300;
        System.out.println(c==d);
        System.out.println(math.round(45.5));
        System.out.println(math.ceil(45.5));
        System.out.println(math.floor(45.5));
        System.out.println("访问\"菜鸟教程!\"");
        System.out.println(Character.isDigit(zhi[1]));
        System.out.println(Character.toUpperCase(zhi[0]));

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(200,200);
    }
}
