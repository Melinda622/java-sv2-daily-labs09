package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {

        List<String> result = new ArrayList<>();
        for (String s : words) {
            if (s.length() == shortestWordsLength(words)) {
                result.add(s);
            }
        }
        return result;
    }

   public int shortestWordsLength(List<String> words) {
       String shortest=null;
       for (int i = 0; i < words.size(); i++) {
           shortest = words.get(0);
           if (words.get(i).length() < shortest.length()) {
               shortest = words.get(i);
           }
       }return shortest.length();
   }
}
