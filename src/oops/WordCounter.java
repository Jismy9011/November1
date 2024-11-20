package oops;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Hello Everyone Have a Nice Day Good Morning.";
        
        int wordCount = countWords(sentence);
         System.out.println(" Total no.of characters : " + wordCount);
    }

    public static int countWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            return 0; 
        }
        
        String[] words = sentence.split("\\s+");
        
        return words.length; 
    }
}
