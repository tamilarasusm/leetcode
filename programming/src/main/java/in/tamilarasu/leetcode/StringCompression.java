package in.tamilarasu.leetcode;

public class StringCompression {

    public int compress(char[] chars) {
        int len = chars.length;
        int i=0;
        int index = 0;
        while(i < len){
            char currentCharacter = chars[i];
            int count = 0;

            while(i < len && chars[i] == currentCharacter){
                count ++;
                i++;
            }
            chars[index++] = currentCharacter;

            if(count > 1){
                char[] charCount = String.valueOf(count).toCharArray();
                for(char ch : charCount){
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}
