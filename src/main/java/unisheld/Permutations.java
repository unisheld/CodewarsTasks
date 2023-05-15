//In this kata, your task is to create all permutations of a non-empty input string and remove duplicates, if present.
//
//        Create as many "shufflings" as you can!
//
//        Examples:
//
//        With input 'a':
//        Your function should return: ['a']
//
//        With input 'ab':
//        Your function should return ['ab', 'ba']
//
//        With input 'abc':
//        Your function should return ['abc','acb','bac','bca','cab','cba']
//
//        With input 'aabb':
//        Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
//        Note: The order of the permutations doesn't matter.
//
//        Good luck!

package unisheld;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    public static List<String> singlePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        Set<String> uniquePermutations = new HashSet<>();

        generatePermutations(input.toCharArray(), 0, uniquePermutations);

        permutations.addAll(uniquePermutations);

        return permutations;
    }

    private static void generatePermutations(char[] chars, int index, Set<String> permutations) {
        if (index == chars.length - 1) {
            permutations.add(String.valueOf(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                generatePermutations(chars, index + 1, permutations);
                swap(chars, index, i); // backtrack
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
