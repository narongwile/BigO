
import java.security.Timestamp;
import java.sql.Time;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class BigO {
    //credit : https://www.geeksforgeeks.org/insertion-sort/

    static void insectionSort(Integer arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are 
			greater than key, to one position ahead 
			of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(Integer arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Integer[] arr1, arr2;

        System.out.println("input N : ");
        int N = sc.nextInt();

        arr1 = new Integer[N];
        arr2 = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = rand.nextInt(N);
        }
        
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        
        
        System.out.println("Insection Sort : ");
        long begin = System.currentTimeMillis();
        Arrays.sort(arr1);
        long end = System.currentTimeMillis();
        printArray(arr1);
        System.out.println("TIME : " + (end - begin));
        
        System.out.println("Array Sort : ");
        begin = System.currentTimeMillis();
        insectionSort(arr2);
        end = System.currentTimeMillis();
        printArray(arr2);
        System.out.println("TIME : " + (end - begin));
    }
}
