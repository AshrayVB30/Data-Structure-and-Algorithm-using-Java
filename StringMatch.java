package Module1;

import java.util.LinkedList;
import java.util.Queue;

public class StringMatch {
    public static void bfsStringMatching(String[] texts, String pattern) {
        int m = pattern.length();

        for (int k = 0; k < texts.length; k++) {
            String text = texts[k];
            int n = text.length();

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i <= n - m; i++) {
                int j;
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == m) { // pattern found
                    System.out.println("Pattern found at index " + i + " in text " + k);
                } else {
                    queue.add(i);
                }
            }

            while (!queue.isEmpty()) {
                int start = queue.poll();
                for (int i = start + 1; i <= n - m; i++) {
                    int j;
                    for (j = 0; j < m; j++) {
                        if (text.charAt(i + j) != pattern.charAt(j)) {
                            break;
                        }
                    }
                    if (j == m) { // pattern found
                        System.out.println("Pattern found at index " + i + " in text " + k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] texts = {"xyzabcxyzxyzabc"};
        String pattern = "pqr";
        System.out.println("Pattern: " + pattern);
        System.out.println("Matching positions:");
        bfsStringMatching(texts, pattern);
    }
}
