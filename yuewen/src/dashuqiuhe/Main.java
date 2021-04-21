package dashuqiuhe;

public class Main {

    public static void main(String[] args) {
        String a="720";
        String b="280";
        //String c="20200201123456789123456789";
        System.out.println(add(a,b));
    }

    public static String add(String str1,String str2){
        char[] a1=str1.toCharArray();
        char[] a2=str2.toCharArray();

        int num1,num2=0;
        int m,n=0;       //

        int idx1=a1.length-1;
        int idx2=a2.length-1;

        StringBuffer stringBuffer=new StringBuffer();

        while (idx1>=0||idx2>=0){
            if(idx1>=0){
                num1=a1[idx1]-'0';
            }else{
                num1=0;
            }

            if(idx2>=0){
                num2=a2[idx2]-'0';
            }else {
                num2=0;
            }

            int sum=num1+num2+n;
            m=sum%10;
            n=sum/10;
            stringBuffer.append(m);
            idx1--;
            idx2--;
        }
        if(n!=0){
            stringBuffer.append(1);
        }
        return stringBuffer.reverse().toString();
    }



}
