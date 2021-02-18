package SlidingWindowStringsArray.SlidingWindowMaximum;

public class SlidingWindowMaximumMain {
    public static void main(String[] args) {
       int[] nums = {1,3,-1,-3,5,3,6,7};
//        SlidingWindowMaximum sm = new SlidingWindowMaximum();
//
//        int[] nums2 = {1,-1};
//        int[] res = sm.maxSlidingWindow(nums2, 1);

        SLMwithDEQUE sld = new SLMwithDEQUE();
        int[] res = sld.maxSlidingWindow(nums, 3);


        int kal =0;
    }
}
