package in.tamilarasu.leetcode;

public class ReverseWords {

    public String reverseWords(String s) {
        String sentence = s.trim();
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence= new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            String str = words[i];
            if (str.isBlank()){
                continue;
            }
            reversedSentence.append(str);
            if (i != 0) {
                reversedSentence.append(" ");
            }

        }
        return reversedSentence.toString();
    }
}
