package com.qinjun.leetcode;

public class SolutionLeet48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        rotate( matrix, n, 0,n);
    }
    public static void rotate(int[][] matrix,int n,int m,int len) {
        if(n == 0 || n == 1){
            return;
        }
        int[] nums = new int[n];
        for(int i = m ,j = 0; i<len-m;i++,j++){
            nums[j] = matrix[m][i];
        }

        //1竖转横
       for (int i = 0; i < n; i++){
           matrix[m][len-1-(i+m)] = matrix[i+m][m];
           //matrix[m][i] = ;
       }
       //横转竖
       for (int i = 0; i < n; i++){
           matrix[i+m][m] = matrix[len-1-m][i+m];
       }
       for (int i = 0; i < n; i++){
           matrix[len-1-m][i+m] = matrix[len-1-(i+m)][len-1-m];
       }
       for (int i = 0; i < n; i++){
           matrix[len-1-(i+m)][len-1-m] = nums[n-1-i];
       }
       rotate(matrix,n-2,m+1,len);
    }

    public static void main(String[] args) {
       int[][] matrix = {{5, 1, 9,11}, { 2, 4, 8,10}, {13, 3, 6, 7},{15,14,12,16}};
       rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
