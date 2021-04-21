import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ZengMingwang
 * @date 2021/3/17 7:03 下午
 */
public class Main {

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);

        String str=sca.nextLine().trim();
        char[] ch_str=str.toCharArray();

        int max_len=0;
        for (int i = 0; i < ch_str.length; i++) {
            for(int j=i+1;j<ch_str.length;j++){
                String temp=str.substring(i,j);
                if(judge(temp)){
                    int cur_len=j-i;
                    if(cur_len>max_len){
                        max_len=cur_len;
                    }
                }

            }
        }
        System.out.println(max_len);
    }

    public static boolean judge(String str){         //如果字符串中重复字符大于2返回false，否则返回true
        char[] ch_str=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < ch_str.length; i++) {
            if(!map.containsKey(ch_str[i])){
                map.put(ch_str[i],1);
            }else{
                int cur_key=map.get(ch_str[i]);
                cur_key++;
                map.remove(ch_str[i]);
                map.put(ch_str[i],cur_key);
            }
        }
        for(char ch:map.keySet()){
            int temp_key=map.get(ch);
            if(temp_key>2){
                return false;
            }
        }
        return true;
    }
}
