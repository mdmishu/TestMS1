package MSStudy.BackTracking.WordSearchII;

import java.util.List;

public class WordSearchIIMain {
    public static void main(String[] args) {
        WordSearchII ws = new WordSearchII();
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };

        String[] words = {"oath","pea","eat","rain"};

        List<String> res = ws.findWords(board,words);
        int kal = 0;
    }
}
