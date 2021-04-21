package 数组中出现次数超过一般的数字;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/20 3:28 下午
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        int len= array.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                int val=map.get(array[i]);
                val++;
                map.put(array[i],val);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)>len/2){
                return i;
            }
        }
        return 0;
    }
}
