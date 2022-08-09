import java.util.*;
public class Mean_mode_median {
    public static void main(String[] args){

    }
    public static double findMean(int[] a){


    int[] array;
    array = new int[10];
    array [0] = 10;
    array [1] = 10 ;
    array [2] = 10;
    array [3] = 10;
    array [4] = 10;
    array [5] = 10;
    array [6] = 10;
    array [7] = 10;
    array [8] = 10;
    array [9] = 10;

    double sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
        return sum / array.length;

 }

    public static int findMode(int[] a)
    {
        int index = 0  ;
        int soFar = 1 ;
        int count = 1 ;
        for(int k =1;   k < a.length; k++){

            if (a[k-1] == a[k]){
                count++ ; }
            if(count > soFar)
            {
                soFar = count ;
                index = k ;
            }
            else {
                count = 1 ;
            }
        }
        return a[index] ;
    }

    public static int findMedian(int[] a)
    {
        int[] array;
        array = new int[10];
        array [0] = 1;
        array [1] = 1 ;
        array [2] = 1;
        array [3] = 1;
        array [4] = 1;
        array [5] = 1;
        array [6] = 1;
        array [7] = 1;
        array [8] = 1;
        array [9] = 1;

        int median = array.length /2 ;
        return array [median] ;
    }
}

