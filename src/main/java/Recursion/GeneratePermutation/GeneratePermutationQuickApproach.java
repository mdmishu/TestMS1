package Recursion.GeneratePermutation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GeneratePermutationQuickApproach {
    public String getPermutation(int n, int k) {

        int[] fact = new int[n+1];
        fact[0] = 1;

        for(int i=1; i<=n; i++){
            fact[i] = fact[i-1]*i;
        }

        List<Integer> nums= new ArrayList<>();

        for(int i=1; i<=n; i++){
            nums.add(i);
        }

        StringBuilder sb = new StringBuilder();
        k--;

        for(int i=1; i<=n; i++){
            int index = k/fact[n-i];
            sb.append(nums.get(index));
            nums.remove(index);
            k -= index * fact[n-i];

        }


        return sb.toString();
    }
}
