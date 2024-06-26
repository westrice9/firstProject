package leetcode;

public class CheckIfSentenceIsPanagram {
    public boolean checkIfPangram(String sentence) {
        int[] letters = new int[26];
        if (sentence.length()>=26) {
            for (int i = 0; i < sentence.length(); i++) {
                int index = 'z'-sentence.charAt(i);
                letters[index]++;
            }
        }else return false;
        for (int i:letters){
            if(i==0)return false;
        }
        return true;
    }
}
