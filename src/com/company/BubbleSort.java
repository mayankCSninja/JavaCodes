package com.company;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {1,21,3,40,10,100,1,2};
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            for (int j=0;j<len-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i =0; i<len;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
