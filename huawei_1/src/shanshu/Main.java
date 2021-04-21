package shanshu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int len=sca.nextInt();
        if(len<3){
            System.out.println("无法删除！");
        }
        int[] temp=new int[len];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=i;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            list.add(temp[i]);
        }
        for (int i =2; i < list.size(); i=i+3) {
            list.remove(i);
        }

    }

}
