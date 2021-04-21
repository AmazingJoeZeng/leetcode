package chachengji;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        String NM=sca.nextLine();
        String score=sca.nextLine();
        int N= Integer.parseInt(String.valueOf(NM.charAt(0)));
        int M=Integer.parseInt(String.valueOf(NM.charAt(1)));
        int[] sco=new int[N];
        for(int i=0;i<N;i++){
            sco[i]=Integer.parseInt(String.valueOf(score.charAt(i)));
        }
        for(int i=0;i<M;i++){
            String operate=sca.nextLine();
            if(operate.charAt(0)=='Q'){
                int begin=Integer.parseInt(String.valueOf(operate.charAt(1)));
                int end=Integer.parseInt(String.valueOf(operate.charAt(2)));
                int result=query(sco,begin,end);
                System.out.println(result);
            }else if(operate.charAt(1)=='U'){
                int stu_num=Integer.parseInt(String.valueOf(operate.charAt(1)));
                int stu_sco=Integer.parseInt(String.valueOf(operate.charAt(2)));
                sco[stu_num-1]=stu_sco;
            }
        }
    }

    public static int query(int[] array,int begin,int end){
        int size=array.length;
        int max=array[begin-1];
        for(int i=begin;i<end;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }


}