package com.company;
public class MaximizeValue {
    public static void main (String[] args){
        int[] array = {-6,3,7,-3,4};
        int p = -2, q=5, r=4;

        int[] sum= new int[array.length-1];
        int max=array[0];

        //Prefix Max
        int[] prefix_max = new int[array.length];
        System.out.print("Prefix_max array = ");
        for (int i=0; i<array.length;i++){
            if (i==0){
                prefix_max[i]= p*array[i];
            }
            else {
                prefix_max[i] = Math.max(prefix_max[i - 1], p*array[i]);
            }
            System.out.print(prefix_max[i] + " ");
        }
        System.out.println();


        //Suffix Max
        int[] suffix_max = new int[array.length];
        System.out.print("Suffix_max array = ");
        for (int i= array.length-1; i>=0;i--){
            if(i== array.length-1){
                suffix_max[i] = Math.max(r*array[i-1],r*array[i]);
            }
            else {
                suffix_max[i] = Math.max(suffix_max[i+1],r*array[i]);
            }
        }
        //printing Suffix max
        for (int i=0;i< array.length;i++){
            System.out.print(suffix_max[i]+ " ");
        }
        System.out.println();

        //for middle term, finding max sum
        for(int mid = 1; mid <= array.length-2;mid++){
            sum[mid]=prefix_max[mid-1]+q*array[mid]+suffix_max[mid+1];
            if (sum[mid]>max){
                max=sum[mid];
            }
            System.out.println("sum = " +sum[mid]);

        }
        System.out.println("Max sum possible = " +max);
    }
}
