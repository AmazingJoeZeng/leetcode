import java.util.ArrayList;
import java.util.Scanner;

public class BestBinary {

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);

        String str_num=sca.nextLine();

        int num = Integer.parseInt(str_num);             //节点个数

        String str_tree=sca.nextLine();                 //二叉树节点

        String[] point = str_tree.split(" ");     //空格划分

        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < point.length; i++) {         //字符串数组转化为整型数组
            list.add(Integer.parseInt(point[i]));
        }

        int result=solve(list);
        System.out.println(result);
    }

    private static int solve(ArrayList<Integer> value){

    }
}
