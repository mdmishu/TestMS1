package Array.RemoveOneMaintainBeautifulOrder;

public class RemoveOneMaintainBeautifulOrder {
    public int getRemoveOneMaintainBeautifulOrder(int[] arr){
        int n = arr.length;
        int index = 0;
        int count = 0;
        //boolean isAsthetic = true;
        if(getOrder(arr, n)){
            return 0;
        }else if (getOrderAcending(arr, n)){
            return -1;
        } else {

            while (index < n) {
                int[] dp = new int[n - 1];
                for (int i = 0, j = 0; i < n; i++) {
                    if (i != index) {
                        dp[j++] = arr[i];
                    }
                }

                // do something
                if (getOrder(dp, dp.length)) {
                    count++;
                }

                index++;
            }
        }
        return count;
    }

    private boolean getOrderAcending(int[] arr, int n){
        for(int i=1; i < n-1; i++ ){
            if(arr[i] == arr[i-1]) return false;
            if(arr[i] > arr[i+1]) {
                return  false;
            }
        }
        return true;
    }

    private boolean getOrder(int[] arr, int n){
        for(int i=1; i < n-1; i++ ){
            if(arr[i] == arr[i-1]) return false;
            if(arr[i] > arr[i-1] && arr[i] < arr[i+1]) {
                return  false;
            }
        }
        return true;
    }
}
