import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ZengMingwang
 * @date 2021/3/17 3:22 下午
 */
public class CaseTransform {

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        String str=sca.nextLine();


        String str_1=toDefault(str);        //第一种情况
        char[] ch_str=str_1.toCharArray();

        char[] ch_str_2=new char[ch_str.length];
        ch_str_2[0]=Character.toLowerCase(ch_str[0]);
        for (int i = 1; i < ch_str.length; i++) {
            ch_str_2[i]=ch_str[i];
        }

        String str_2=new String(ch_str_2);     //第二种情况

        ArrayList<Character> list_3=new ArrayList<>();

        for (int i = 0; i < ch_str_2.length; i++) {
            if(Character.isUpperCase(ch_str_2[i])){
                list_3.add('_');
                list_3.add(Character.toLowerCase(ch_str_2[i]));
            }
            else{
                list_3.add(ch_str_2[i]);
            }
        }
        char[] ch_str_3=new char[list_3.size()];
        for (int i = 0; i < ch_str_3.length; i++) {
            ch_str_3[i]=list_3.get(i);
        }
        String str_3=new String(ch_str_3);
        String str_4=str_3.replace('_','-');
        System.out.println(str_1+' '+str_2+' '+str_3+' '+str_4);
    }

    public static String toDefault(String str){
        if(Character.isUpperCase(str.charAt(0))){
            return str;
        }
        else if(str.contains("-")){
            ArrayList<Character> list=new ArrayList<>();
            char[] ch_str=str.toCharArray();
            ch_str[0]=Character.toUpperCase(ch_str[0]);
            for (int i = 0; i < ch_str.length; i++) {
                if(ch_str[i]=='-'){
                    i++;
                    list.add(Character.toUpperCase(ch_str[i]));
                }else{
                    list.add(ch_str[i]);
                }
            }
            char[] result=new char[list.size()];
            for (int i = 0; i < result.length; i++) {
                result[i]=list.get(i);
            }
            return new String(result);
        }
        else if(str.contains("_")){
            ArrayList<Character> list=new ArrayList<>();
            char[] ch_str=str.toCharArray();
            ch_str[0]=Character.toUpperCase(ch_str[0]);
            for (int i = 0; i < ch_str.length; i++) {
                if(ch_str[i]=='_'){
                    i++;
                    list.add(Character.toUpperCase(ch_str[i]));
                }else{
                    list.add(ch_str[i]);
                }
            }
            char[] result=new char[list.size()];
            for (int i = 0; i < result.length; i++) {
                result[i]=list.get(i);
            }
            return new String(result);
        }else{
            char[] ch_str=str.toCharArray();
            ch_str[0]=Character.toUpperCase(ch_str[0]);
            return new String(ch_str);
        }
    }
}
