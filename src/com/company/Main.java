package com.company;

import java.util.*;

public class Main {

    public static void getPrefix(String[] array){
        int a=88888;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length()<a){
                a=array[i].length();
            }
        }
        int c=0;
        int g=0;
        for (int i = 0; i < a; i++) {
            char b= array[0].charAt(i);
            for (int j = 0; j < array.length; j++) {
                if(array[j].charAt(i) != b){
                    c=-1;
                    break;
                }
            }
            if(c!=-1){
                System.out.print(b);
                g++;
            }else{
                if(g>0){
                    System.out.println(" it's the total prefix for this list");
                    break;
                }else {
                    System.out.println("this list don't have total prefix");
                    break;
                }
            }
        }
    }

    public static void hasRepetitions(int[] array){
        List<Integer> arrays= new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrays.add(array[i]);
        }
        List<Integer> usedIndex= new ArrayList<>();
        int a =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(arrays.get(i).equals(arrays.get(j))
                        && !usedIndex.contains(i)){
                    usedIndex.add(j);
                    a++;
                }
            }
            if(a>1) {
                System.out.println(arrays.get(i) + " repeats "+ a + " times");
            }
            a = 0;
        }
    }

    public static void main(String[] args) {
        int[] array= {1, 9, 8, 16, 35, 7, 56, 2, 1, 8};
        String[] array2={"abc","abcd","abcde","aba"};
        hasRepetitions(array);
        getPrefix(array2);
    }
}
