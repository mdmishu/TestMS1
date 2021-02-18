package SlidingWindowStringsArray.RepeatedDNASequences;

import java.util.List;

public class RepeatedDNASequencesMain {
    public static void main(String[] args) {
        RepeatedDNASequences repeatedDNASequences = new RepeatedDNASequences();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> res = repeatedDNASequences.findRepeatedDnaSequences(s);
    }
}
