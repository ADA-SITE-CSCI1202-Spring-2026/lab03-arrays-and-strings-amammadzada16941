package week05.week05;
public class StringUtil {
     // Question7
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // Question8
    public static String explode(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.substring(0, i + 1));
        }
        return sb.toString();
    }

    // Question9
    public static String sortString(String s) {
        char[] chars = s.toCharArray();  

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - 1 - i; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            } 
        }

        return new String(chars);
    }

    // Question10
    public static boolean isAnagram(String s1, String s2){
        String n_s1 = sortString(s1);
        String n_s2 = sortString(s2);

        return n_s1.equals(n_s2);
    }

    // Question11
    public static String swapFirstLastInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() <= 1) {
                result.append(word);
            } else {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                result.append(last).append(middle).append(first);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "Baku";
        String s2 = "kuBa";

        System.out.println(reverse(s1));
        System.out.println(explode(s1));
        System.out.println(sortString(s1));
        System.out.println(isAnagram(s1, s2));
    }
}
