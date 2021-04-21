import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author ZengMingwang
 * @date 2021/4/2 3:54 下午
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(compileSeq("1,2,-1,1"));
    }

    public static String compileSeq (String input) {
        String str_input=input;
        //ArrayList<Integer> output=new ArrayList<>();
        String[] input_arr=str_input.split(",");

        int[] num=new int[input_arr.length];              //存放当前还没有被编译文件的编号
        for (int i = 0; i < input_arr.length; i++) {
            num[i]=Integer.parseInt(input_arr[i]);
        }
        ArrayList<Integer> num_list=new ArrayList<>();
        num_list=get_result(num,num_list);
        return output(num_list);
    }

    public static ArrayList<Integer> get_result(int @NotNull [] in_list, ArrayList<Integer> out_list){
        boolean flag=false;
        for (int i = 0; i < in_list.length; i++) {
            if(in_list[i]!=1000000){      //存在还没有被编译的文件
                flag=true;
                break;
            }
        }
        if(flag){
            for (int i = 0; i < in_list.length; i++) {
                if (in_list[i] < 0) {                   //存在直接可以编译的文件
                    out_list.add(i);                  //加入编号到输出list
                    in_list[i]=1000000;
                }
            }
            for (int i = 0; i < in_list.length; i++) {
                if (out_list.contains(in_list[i])) {      //在已编译完成的文件中包含该文件的前置文件
                    out_list.add(i);
                    in_list[i]=1000000;
                    break;
                }
            }
            get_result(in_list,out_list);
        }
        return out_list;
    }

    public static String output(ArrayList<Integer> list){
        ArrayList<String> o_list=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                o_list.add(list.get(i).toString());
            }else{
                o_list.add(list.get(i).toString());
                o_list.add(",");
            }
        }
        char[] ch_list=new char[o_list.size()];
        for (int i = 0; i < ch_list.length; i++) {
            ch_list[i]=o_list.get(i).charAt(0);
        }
        return new String(ch_list);
    }
}
