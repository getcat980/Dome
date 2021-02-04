import java.util.Random;
import java.util.Scanner;


/*
 * 随机点名
 * 1.存在班级所有学生的姓名
 * 2.浏览器打印学生的姓名
 * 3.随机点名并把名称打印出来
 */
public class hello {
    public static void main(String[] args) {
      String Name[] = new String[3];
      for(int i=0; i< Name.length;i++) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("请输入学生姓名");
          Name[i] = scanner.next();
      }
      for(int i=0; i<Name.length; i++){
          System.out.println(Name[i]);
      }
      //随机点名
        Random random = new Random();
      System.out.println("被点名的同学是"+Name[new Random().nextInt(3)]);
    }
}