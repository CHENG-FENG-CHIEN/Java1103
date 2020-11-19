package com.ocp6;

public class ForLoop3 {
    public static void main(String[] args) {
        int [][][] nums ={
            {{100,90},{80,70},{60,50}},
            {{70,90},{80,100},{90,90}}
        };
        //求所有數字總和
        int sum =0;
        for (int[][] num : nums) {
            for(int[] n :num){
                for(int s:n){   
                    System.out.println(s);
                   sum += s;      
                }
            }
           
        }
         System.out.printf("sum= %d\n",sum);
         System.out.println("======================================");
         //Standard for-loop
         sum=0;
         for (int i = 0; i < nums.length; i++) {
            int[][] num = nums[i];
             for (int j = 0; j < num.length; j++) {
                 int[] is = num[j];
                 for (int k = 0; k < is.length; k++) {
                     int n = is[k];
                     System.out.println(n);
                     sum += n;
                 }
             }
        }
          System.out.printf("sum= %d\n",sum);
    }
}
