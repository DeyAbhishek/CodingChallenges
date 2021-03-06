// https://www.hackerrank.com/challenges/gem-stones

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonCharactersInMultipleStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int j = 1;
        String str1 = scanner.next();
        char[] ch = str1.toCharArray();
        ArrayList<Character> res = new ArrayList<Character>();
        for (char c : ch) {
            res.add(c);
        }
        String str2 = "";
        while (j < count) {
            str2 = scanner.next();
            char[] arr = str2.toCharArray();
            ArrayList<Character> lst = new ArrayList<Character>();
             for (char c : arr) {
                lst.add(c);
            }
            res.retainAll(lst);
            j++;
        }
        HashSet<Character> set = new HashSet<Character>(res);    //// TO REMOVE DUPLICATES
        System.out.println(set.size());
        
    }
}

/*
PROBLEM STATEMENT:

John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a 
lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a
gem-element if it occurs at least once in each of the rocks.

Given the list of NN rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of an integer, NN, the number of rocks. 
Each of the next NN lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.

Constraints 
1≤N≤1001≤N≤100 
Each composition consists of only lower-case Latin letters ('a'-'z'). 
1≤1≤ length of each composition ≤100≤100
Output Format

Print the number of gem-elements that are common in these rocks. If there are none, print 0.

Sample Input

3
abcdde
baccd
eeabg
Sample Output

2
Explanation

Only "a" and "b" are the two kinds of gem-elements, since these are the only characters that occur in every rock's composition.
*/
