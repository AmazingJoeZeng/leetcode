import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca_num=new Scanner(System.in);

        String peo_info=sca_num.nextLine();
        String[] peo=peo_info.split(" ");
        int peo_num=Integer.parseInt(peo[0]);
        int low_num=Integer.parseInt(peo[1]);
        int high_num=Integer.parseInt(peo[2]);

        String score_info=sca_num.nextLine();
        String[] str_score=score_info.split(" ");

        int[] score=new int[peo_num];
        for (int i = 0; i < peo_num; i++) {
            score[i]=Integer.parseInt(str_score[i]);
        }

        Arrays.sort(score);

        int eli_num=0;
        int rise_num=0;

        for(int i=score[0];i<=score[peo_num-1];i++){         //m在最高分和最低分之间滑动
            for (int i1 = 0; i1 < score.length; i1++) {
                if(score[i1]>i){             //分数大于分数线
                    rise_num++;
                }else{
                    eli_num++;
                }
            }
            if(rise_num>=low_num&&rise_num<=high_num&&eli_num>=low_num&&eli_num<=high_num){
                System.out.println(i);
                return;
            }else{
                rise_num=0;
                eli_num=0;
            }
        }
        System.out.println(-1);
        return;
    }
}
