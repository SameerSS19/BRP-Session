package com.practiceproblem;

public class PrimeNumberRange {
    public static void main(String[] args){
        int count , sum=0;
        for (int num=1;num<=100;num++){
            count = 0;
            for (int i =2;i<=num/2;i++){
                if (num%i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0 && num!=1){
                sum=sum+num;
            }
        }
        System.out.println("the sum of number 1 to 100 is:"+sum);
    }
}
