import java.util.Stack;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/19 11:54 上午
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

    }

    public boolean isValid(String s){
        boolean flag=true;

        while (flag){
            int len=s.length();
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
            if(len==s.length()){
                flag=false;             //没有更多等括号消除
            }
        }
        if(s.length()==0){
            return true;
        }else {
            return false;
        }
    }
    
    
    public static boolean isValid_2(String s){
        char[] ch=s.toCharArray();
        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < ch.length; i++) {
            if(stack.empty()){
                stack.push(ch[i]);
                break;
            }
            if(ch[i]==')'&& stack.peek()=='('){
                stack.pop();
            }else if(ch[i]==']'&&stack.peek()=='['){
                stack.pop();
            }else if(ch[i]=='}'&&stack.peek()=='{'){
                stack.pop();
            }else{
                stack.push(ch[i]);
            }
        }
        return stack.empty();
    }

    
}
