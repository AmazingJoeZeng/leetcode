import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author ZengMingwang
 * @date 2021/3/17 8:03 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);

        int max_pro=Integer.parseInt(sca.nextLine());
        int start_w=Integer.parseInt(sca.nextLine());
        String profits=sca.nextLine();
        String need=sca.nextLine();
        String[] str_profits=profits.split(",");
        String[] str_need=need.split(",");
        int[] profits_num=new int[str_profits.length];
        int[] need_num=new int[str_need.length];
        for (int i = 0; i < profits_num.length; i++) {
            profits_num[i]=Integer.parseInt(str_profits[i]);
            need_num[i]=Integer.parseInt(str_need[i]);
        }

        int cur_w=start_w;

        while(max_pro>0){
            max_pro--;
            ArrayList<Integer> can_index=can_pro(cur_w,need_num);
            int max_profit=0;
            int temp_i=0;
            for (int i = 0; i < can_index.size(); i++) {
                int temp_profit=profits_num[can_index.get(i)]-need_num[can_index.get(i)];
                if(temp_profit>max_profit){
                    max_profit=temp_profit;
                    temp_i=can_index.get(i);
                }
            }
            cur_w=cur_w+profits_num[temp_i]-need_num[temp_i];
            need_num[temp_i]=100000000;
        }
        int left_w=cur_w-start_w;
        System.out.println(left_w);
    }

    public static ArrayList<Integer> can_pro(int money,int[] need){
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < need.length; i++) {
            if(need[i]<=money){
                result.add(i);
            }
        }
        return result;
    }
}
