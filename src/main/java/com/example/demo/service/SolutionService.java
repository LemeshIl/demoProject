package com.example.demo.service;

public class SolutionService {

    public static void main(String[] args) {
        String s = "1342";//11
        long startTime = System.nanoTime();
        System.out.println(getSum(s));
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

    }

    public static int getSum(String s) {
        int count=s.length();
        int res = Integer.parseInt(s);
        int a=0;
        while (res!=0){
            a+=res%10;
            res=res/10;
        }
        return a;

    }

}


//    String[] res = s.split("");
//        System.out.println(res);
//                int sum=0;
//                for (int i = 0; i < res.length; i++) {
//        sum+=Integer.parseInt(res[i]);
//        }
//        return sum;