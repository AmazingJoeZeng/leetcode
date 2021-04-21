import java.util.Scanner;

/**
 * @author ZengMingwang
 * @date 2021/4/9 2:53 下午
 */
public class Main {

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        String in_put= sca.nextLine();
        for(int i=0;i<in_put.length();i++){
            String temp_str=drop_i(in_put,i);
            if(is_huiwen(temp_str)){
                System.out.println(temp_str);
                return;
            }
        }
        System.out.println("false");
    }

    public static boolean is_huiwen(String input){
        char[] ch_input=input.toCharArray();
        int len=input.length();
        boolean flag=false;
        if(len%2==0){
            flag=true;            //当长度为偶数时
        }
        int in_index;
        if(flag){
            in_index = len / 2 - 1;
            for (int i = 0; i <=in_index; i++) {
                if(ch_input[i]!=ch_input[len-1-i]){
                    return false;
                }
            }
        }else{
            in_index = len / 2;
            for (int i = 0; i < in_index; i++) {
                if(ch_input[i]!=ch_input[len-1-i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static String drop_i(String str,int i){
        int len=str.length()-1;
        char[] result=new char[len];
        char[] ch_str=str.toCharArray();
        for (int i1 = 0; i1 < i; i1++) {
            result[i1]=ch_str[i1];
        }
        for(int i2=i+1;i2<str.length();i2++){
            result[i2-1]=ch_str[i2];
        }
        return new String(result);
    }
}
