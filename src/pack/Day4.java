package pack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day4 {
    private final int MIN_VALUE = 146810;
    private final int MAX_VALUE = 612564;

    int bruteForcePw() {
        int possiblePasswords = 0;
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            if (checkForDuplicates(chars) && neverDecrease(chars)) {
                System.out.println(Arrays.toString(chars) + " = " + (checkForDuplicates(chars) && neverDecrease(chars)));
                possiblePasswords++;
            }
        }
        return possiblePasswords;
    }

    boolean neverDecrease(char[] input){
        for (int j = 0; j < input.length - 1; j++) {
            if (input[j] > input[j+1]) {
                return false;
            }
        }
        return true;
    }
    boolean checkForDuplicates(char[] input) {
        Set<Character> store = new HashSet<>();

        for (char c : input) {
            if (store.add(c) == false) {
                return true;
            }
        }
        return false;
    }
}
