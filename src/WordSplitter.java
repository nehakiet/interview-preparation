/*
Given an array of words and a string without having any space between them. Returns true/false
If splitting the string matches at least single word from that array of words.If not return false.
For eg : [pearl, dog, grasshoper], str=’adogwillbeneverpearl’
*/


public class WordSplitter {
    public static void main(String[] args) {
        String[] words = {"ram", "neha", "krishna"};
        String str = "adogwillbeneverpearlram";
        boolean result = splitMatchesWord(words, str);
        System.out.println(result);
    }

//  private static boolean splitMatchesWord(String[] words, String str) {
//     for (int i = 0; i < str.length(); i++) {
//            for (String word : words) {
//                if (str.contains(word)) {
//                    return true;
//
//                }
//
//            }
//          }
//        return false;
//    }
    private static boolean splitMatchesWord(String[] words, String str) {
        for (int i = 0; i < str.length(); i++) {
            for (String word : words) {
                if (str.startsWith(word, i)) {
                    return true;

                }

            }
        }
        return false;
    }

}