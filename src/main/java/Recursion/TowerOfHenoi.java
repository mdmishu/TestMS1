package Recursion;

public class TowerOfHenoi {
    public void hanoi(int n, int start, int end){
        //base case

        if(n==1){
            printMove(start,end);
        }

        else{
            int mid = 6-(start+end);
            hanoi(n-1, start, mid);
            printMove(start,end);
            hanoi(n-1,mid,end);
        }

    }

    public void printMove(int start, int end){
        System.out.println( start + "->" + end );
    }
}
