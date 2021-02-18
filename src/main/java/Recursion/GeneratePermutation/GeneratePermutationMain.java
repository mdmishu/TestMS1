package Recursion.GeneratePermutation;

public class GeneratePermutationMain {
    public static void main(String[] args) {
        //GeneratePermutatiom gp = new GeneratePermutatiom();
        //String res = gp.getPermutation(3,3);

        // working but slow approach and failing in big numbers
        //GeneratePermutaionGetValue gp = new GeneratePermutaionGetValue();
        //String res = gp.getPermutaionValue(3,5);

        GeneratePermutationQuickApproach gpq = new GeneratePermutationQuickApproach();
        String res = gpq.getPermutation(3,5);


        int kal =0;
    }
}
