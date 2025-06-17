package in.tamilarasu.leetcode;

import java.util.Set;

public class ReverseVowels {

    public String reverseVowels(String s) {

        char[] characters = s.toCharArray();

        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');
        for(int i=0, j= s.length()-1; i< j; i++, j--){
            while (i < j && !set.contains(characters[i])){
                i++;
            }
            while (i < j && !set.contains(characters[j])){
                j--;
            }

            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }

        return new String(characters);
    }
}
