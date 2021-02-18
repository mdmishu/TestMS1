package AlgorithmsSortings.QuickSort;

public class QuickSortMain {
    public static void main(String[] args) {
        int[] arr = {9,6,3,5,7,4,1,2,8};
        QuickSort qs = new QuickSort();
        qs.getQuickSort(arr, 0 , arr.length - 1);
        int kal = 0;
    }
}
