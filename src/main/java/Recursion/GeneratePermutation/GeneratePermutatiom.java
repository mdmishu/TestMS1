package Recursion.GeneratePermutation;

public class GeneratePermutatiom {
    public String getPermutation(int n, int k) {
        String res = "";

        int[] arr = {1,2,3};

        generatePermutation(arr, 0);
        return res;
    }

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

    /*
    private void generatePerm(int[] arr, int size, int n) {

        if(size ==1){
           printArr(arr,n);
        }

        for(int i=0; i< size; i++){
            swap(arr,i, size-1);
            generatePerm(arr, size-1,n);
            swap(arr,i, size-1);
        }
    }*/


}
