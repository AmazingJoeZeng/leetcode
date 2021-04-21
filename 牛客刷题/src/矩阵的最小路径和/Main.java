package 矩阵的最小路径和;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/20 5:11 下午
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int[][] matrix={{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        int sum=minPathSum(matrix);
        System.out.println(sum);
    }

    public static int minPathSum (int[][] matrix) {
        // write code here
        if(matrix.length==0){
            return 0;
        }
        int sum=matrix[0][0];
        int i=0;
        int j=0;
        int i_len=matrix.length;    //有多少行
        int j_len=matrix[i].length;        //有多少列
        while(i<i_len&&j<j_len){            //当i，j的坐标不超过i_len-1和j_len-1
            if(i==i_len-1&&j==j_len-1){
                break;
            }
            if(i!=i_len-1&&j==j_len-1){      //最后一列，但不是最后一行
                i++;//行+1
                sum=sum+matrix[i][j];
            }else if(j!=j_len-1&&i==i_len-1){        //最后一行，但不是最后一列
                j++;//列+1
                sum=sum+matrix[i][j];
            }else{
                int left=matrix[i][j+1];      //j是横向的增加
                int down=matrix[i+1][j];      //i是纵向的增加
                if(left>down){
                    i++;
                }else{
                    j++;
                }
                sum=sum+matrix[i][j];
            }
        }
        return sum;
    }

    public static int minPathSum_1(int[][] matrix){
        
    }
}
