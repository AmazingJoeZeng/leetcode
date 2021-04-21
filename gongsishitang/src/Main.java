import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> result=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);

        String str_num= sca.nextLine();
        int num= Integer.parseInt(str_num);


        for (int i = 0; i < num; i++) {
            String table_num=sca.nextLine();    //多少个桌
            String eat_info=sca.nextLine();     //这些桌的用餐情况
            char[] e_info=eat_info.toCharArray();
            int[] e_info_arr=new int[e_info.length];
            for (int i1 = 0; i1 < e_info_arr.length; i1++) {      //将用餐情况转化为整型数组
                e_info_arr[i1]=Integer.parseInt(String.valueOf(e_info[i1]));
            }
            String person_num=sca.nextLine();    //用餐人数
            String gender_info=sca.nextLine();    //用餐性别情况
            char[] g_info=gender_info.toCharArray();    //
            choice(e_info_arr,g_info);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static void choice(int[] t_info,char[] p_info){
        for (int i = 0; i < p_info.length; i++) {
            if(p_info[i]=='M') {                //男性
                int temp1=is_1(t_info);
                if(temp1!=-1){
                    result.add(temp1+1);
                    t_info[temp1]=2;
                }
                else {                        //如果没有一个人坐的位置
                    int temp2=is_0(t_info);
                    if(temp2!=-1){
                        result.add(temp2+1);
                        t_info[temp2]=1;
                    }
                }
            }else{                //女性
                int temp1=is_0(t_info);
                if(temp1!=-1) {
                    result.add(temp1 + 1);
                    t_info[temp1] = 1;
                }else {
                    int temp2=is_1(t_info);
                    if(temp2!=-1){
                        result.add(temp2+1);
                        t_info[temp2]=2;
                    }
                }
            }
        }
    }

    public static int is_1(int[] t_info){             //判断数组中是否有1
        for (int i = 0; i < t_info.length; i++) {
            if(t_info[i]==1){
                return i;
            }
        }
        return -1;
    }

    public static int is_0(int[] t_info){             //判断数组中是否有0
        for (int i = 0; i < t_info.length; i++) {
            if(t_info[i]==0){
                return i;
            }
        }
        return -1;
    }
}
