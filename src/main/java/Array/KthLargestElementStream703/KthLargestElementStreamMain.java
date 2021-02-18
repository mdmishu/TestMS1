package Array.KthLargestElementStream703;

public class KthLargestElementStreamMain {
    public static void main(String[] args) {
        int k =3;
        int[] arr = {4,5,8,2};
        KthLargestElementStream ks = new KthLargestElementStream(k,arr);
        int res = ks.add(3);
        int res1 = ks.add(5);
        int res2 = ks.add(10);
        int res3 = ks.add(9);
        int res4 = ks.add(4);
        int kal = 0;
    }
}
