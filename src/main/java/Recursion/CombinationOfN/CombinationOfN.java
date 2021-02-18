package Recursion.CombinationOfN;

public class CombinationOfN {
    public int getCombinationOfN(int n){
        if (n == 2) return 2;
        return n+getCombinationOfN(n-1);
    }
}
