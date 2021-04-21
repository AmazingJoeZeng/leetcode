import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author ZengMingwang
 * @date 2021/3/16 3:33 下午
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line=br.readLine())!=null){
            String nmab=line;
            String[] nmab_ch=nmab.split(" ");
            int n=Integer.parseInt(nmab_ch[0]);
            int m=Integer.parseInt(nmab_ch[1]);
            int a=Integer.parseInt(nmab_ch[2]);
            int b=Integer.parseInt(nmab_ch[3]);

            String cur_cake= br.readLine();
            String[] cur_cake_ch=cur_cake.split(" ");
            int cur_1=Integer.parseInt(cur_cake_ch[0]);
            int cur_2=Integer.parseInt(cur_cake_ch[1]);
            judge(n,m,a,b,cur_1,cur_2);
        }
    }

    public static void judge(int n,int m,int a,int b,int cur_1,int cur_2){
        int left_cake=n-m;      //剩余可以烤的糕点
        if(a>b){                //保证a小于等于b
            int temp=a;
            a=b;
            b=temp;
        }
        //当剩余可以烤的糕点数量大于等于2时，
        if(left_cake>=2){
            if((cur_1>=a&&cur_1<=b)&&(cur_2>=a&&cur_2<=b)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else if(left_cake==1){
            if(a==cur_1){
                if(cur_2>=a&&cur_2<=b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            else if(a==cur_2){
                if(cur_1>=a&&cur_1<=b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }else if(b==cur_1){
                if(cur_2>=a&&cur_2<=b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else if(b==cur_2){
                if(cur_1>=a&&cur_1<=b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }else{
            if((a==cur_1&&b==cur_2)||(a==cur_2&&b==cur_1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
