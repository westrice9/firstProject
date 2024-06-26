package homework;

import java.util.Arrays;

public class RearrangeEvenOdd {
    public static void main(String[] args) {
//        Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.
        int[] arr = {11,22,23,34,45,56,67,89};
        int[] evenOdd = new int [arr.length];
        int j= 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]%2==0){
                evenOdd[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i<arr.length;i++){
            if (arr[i]%2==1){
                evenOdd[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evenOdd));
    }
}
