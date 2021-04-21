package qishuibing;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("src/qishuibing/test.txt");
            InputStreamReader isr = new InputStreamReader(fi);
            BufferedReader br = new BufferedReader(isr);

            String line=null;

            while((line= br.readLine())!=null){
                if(line.equals("0")){
                    return;
                }
                int num=Integer.parseInt(line);
                System.out.println(answer(num));

            }
            br.close();
            isr.close();
            fi.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int answer(int num){
        if(num==0){
            return 0;
        }else if(num==1){
            return 0;
        }
        else if(num==2){
            return 1;
        }
        else if(num==3){
            return 1;
        }
        int ex_num=num/3;     //可以兑换的饮料瓶数
        int left=num%3;       //余下瓶子
        int total=ex_num+left;
        return ex_num+answer(total);
    }
}
