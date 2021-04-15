package com.company;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,10};
        int search = 1;
        int h = arr.length-1;
        int l = 0;
        boolean flag = false;
        while (l<=h){
            int m= (l+h)/2;
            if(search==arr[m]){
                System.out.println("Element found at: " +m);
                flag=true;
                break;
            }
            if (search<arr[m]){
                h=m-1;
            }
            if (search>arr[m]){
                l=m+1;
            }

        }
        if (flag==false){
            System.out.println("Number not found");
        }
    }
}
