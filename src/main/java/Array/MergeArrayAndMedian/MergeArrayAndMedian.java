package Array.MergeArrayAndMedian;

public class MergeArrayAndMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1+n2;
        int i=0, j=0, k=0;
        int[] nums3 = new int[n3];

        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j] ){
                nums3[k++] = nums1[i++];
            }else{
                nums3[k++] = nums2[j++];
            }
        }

        while(i<n1){
            nums3[k++] = nums1[i++];
        }

        while(j<n2){
            nums3[k++] = nums2[j++];
        }


        // merge completed

        // now find median

        if(n3%2 != 0){
            return (double) nums3[n3/2];
        }else{
            return (double) (nums3[(n3 -1)/2] + nums3[n3/2]) / 2.0;
        }
    }

}
