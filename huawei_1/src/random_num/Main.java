package random_num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n_num=sca.nextInt();             //输入多少个数字
        int[] num_array=new int[n_num];
        for (int i = 0; i < n_num; i++) {
            num_array[i]=sca.nextInt();
        }
        Arrays.sort(num_array);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_array.length; i++) {
            list.add(num_array[i]);
        }
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)==list.get(i+1)){
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
