package 图像练习1号;

public class java练习题1天类方法 {
    //数组方法
        public static int shuLiang(int n){
            int shu[] = new int[n+1];
            shu[0]= 1;
            shu[1]= 2;
            shu[2]= 3;
            for(int i=2;i<=n;i++){
                shu[i]= shu[i-1]+ shu[i-2];
            }
            return shu[n];
    }
    //循环求解
        public static int shuLiang1(int n){
            int j=2,l=1,k=0;
            for(int i=2; i<=n; i++){
                k = j+l;
                l=j;
                j=k;
            }
            return(j);
        }
        //递归求解
    public static int shuLiang2(int n){
            if(n==0){
                return(1);
            }
            if(n==2){
                return(3);
            }
            if(n==1){
                return(2);
            }
            return shuLiang2(n-1)+shuLiang2(n-2);
    }
}
