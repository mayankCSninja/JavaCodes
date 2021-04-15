package com.company;

public class StringWordReverse {
    public static void main(String[] args){
        String str = "This is Java";
        String[] words=str.split(" ");
        for (int i =0; i < words.length;i++){
            String reverse= "";
            for (int j = words[i].length()-1;j>=0;j--){
                reverse+= words[i].charAt(j);
            }
            System.out.print(reverse+" ") ;
        }
    }
}