package Recursion.GeneratePermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratePermutaionGetValue extends  GeneratePermutatiom{
    List<String> list = new ArrayList<>();
    public String getPermutaionValue(int n, int k){
        //int[] arr = {1,2,3};
        int[] arr = new int[n];

        for(int i=0, j=1; i<n && j<=n; i++, j++ ){
            arr[i]=j;
        }

        generatePermutation(arr, 0);
        Collections.sort(list);
        String res = list.get(k-1);
        return res;
    }
    @Override
    void printArr(int a[])
    {

        String res="";
        for (int i = 0; i < a.length; i++)
            res = res + a[i];
        //System.out.println();
        list.add(res);
    }

/*
    public void generatePermutation(int[] number, int index){
        if(index == number.length){
            printArr(number);
            return;
        }
        for(int i = index; i<number.length; i++){
            swap(number, i, index);
            generatePermutation(number, index+1);
            swap(number, i, index);
        }


    }
    void printArr(int a[])
    {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    void swap(int[] arr, int i, int y ){
        int temp = arr[i];
        arr[i] = arr[y];
        arr[y] = temp;
    }

 */
}
