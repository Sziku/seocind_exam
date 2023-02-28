package org.example;

public class CodeBreaker {
    int[] countCharacters(String text) {
        int[] result = new int[26];
        if(text==null || text.equals("")  ){
            return result;
        }

        char[] lettes = text.replaceAll("\\s", "").toLowerCase().toCharArray();

        for (int i = 0; i < lettes.length; i++) {
            result[lettes[i]-97]++;
        }
        return result;
    }

}
