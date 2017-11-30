package com.pano.algorithm;

/**
 * Created by robot on 2017/8/22.
 */
public class SelectionSort {


    public static void selectionSort(int[] a){
        int n = a.length;
        //找出最小的，第一个，第二个。。。依次类推
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
               if(a[i]<a[j]){
                   int tmp=a[i];
                   a[i]=a[j];
                   a[j]=tmp;
               }
            }
        }
        for (int i:a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] a={1,3,4,2,9,6};
        selectionSort(a);
    }


}
