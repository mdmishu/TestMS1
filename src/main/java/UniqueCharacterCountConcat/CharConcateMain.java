package UniqueCharacterCountConcat;

import java.util.ArrayList;
import java.util.List;

public class CharConcateMain {
    public static void main(String[] args) {
        List<String> mylists= new ArrayList<>();
        mylists.add("un");
        mylists.add("qu");
        mylists.add("ie");

        UniqueCharCountConcate uc = new UniqueCharCountConcate();
        int res = uc.maxLength(mylists);
        int kal = 0;
    }
}
