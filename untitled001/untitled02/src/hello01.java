public class hello01 {
    int year;
    int month;
    int day;
    public hello01(){
        day = 1;
        month = 2;
        year = 1999;
    }
    public hello01(int a,int b,int c){
        year = c;
        month = b;
        day = a;
    }
    public void display(){
        System.out.println(year+"  "+month+"  "+day);
    }

    public static void main(String[] args) {
        hello01 wang = new hello01();
        hello01 wang1 = new hello01(11,1,2021);
        wang.display();
        wang1.display();
    }
}
