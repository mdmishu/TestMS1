package AlgorithmsSortings.QuickSort;

public class QuickSort {

    public void getQuickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int pivot = arr[(left+right) / 2];
        int index = getPartition(arr, left, right, pivot);
        getQuickSort(arr,left, index -1);
        getQuickSort(arr, index, right);
    }

    private int getPartition(int[] arr, int left, int right, int pivot) {
        while(left <= right){
            while(arr[left] < pivot ){
                left++;
            }
            while(arr[right] > pivot){
                right--;
            }

            if(left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
