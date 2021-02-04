package Lizi;
/*
 *__________________________________________________
 *    书名             作者        出版社     单价  库存
 * Java基础案例教程  黑马程序员  人民邮电出版社  54.0  290
 * Java程序设计        郑珂    中国铁道出版社  32.0  120
 * _________________________________________________
 * 总量：
 * 总价格：
 */
public class 商品列表01{
    public static void main(String[] args) {
        // TODO: AUTO-generated method stub
        // 声明变量 定义变量：数据类型  变量名称
        String bName1;
        bName1 = "Java基础案例教程";
        String bAuthor1 = "黑马程序员";
        String bPuliction1 = "人民邮电出版社";
        float bPrice1 = 54.0f;
        short bCount1 = 290;
        String bName2;
        bName2 = "Java程序设计";
        String bAuthor2 = "郑珂";
        String bPuliction2 = "中国铁道出版社";
        float bPrice2 = 32.0f;
        short bCount2 = 120;

        int total = bCount1 + bCount2;
        float totalprice = bPrice1 * bCount1 + bPrice2 * bCount2;

        System.out.println("__________________________________________________");
        System.out.println("   书名      作者        出版社         单价      库存");
        System.out.println( bName1+" "+bAuthor1+" "+bPuliction1+"  "+bPrice1+"   "+bCount1);
        System.out.println(   bName2+"  "+bAuthor2+"  "+bPuliction2+"    "+bPrice2+"     "+bCount2);
        System.out.println("__________________________________________________");
        System.out.println("总量"+total);
        System.out.println("总价格"+totalprice);
    }
}