package 斐波那契数列;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/19 2:49 下午
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

    }

    public int Fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }


}
