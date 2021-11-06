
// This problem was asked by Google.

// The edit distance between two strings refers to the minimum number of
// character insertions, deletions, and substitutions required
// to change one string to the other. For example, the edit distance
// between “kitten” and “sitting” is three:
// substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        sout("distance: " + measureDistance("kitten", "sitting")); // 3
        sout("distance: " + measureDistance("kitten", "kitten")); // 0
    }

    private static int measureDistance(String f, String t) {
        int distance = 0;
        char[] from = f.toCharArray();
        char[] to = t.toCharArray();

        if (from.length != to.length) {
            distance = to.length - from.length;
        }

        for (int i = 0; i < to.length - distance; i++) {
            if (to[i] != from[i]) {
                distance++;
            }
        }

        return distance;
    }

    static void sout(String str) {
        System.out.println(str);
    }
}
