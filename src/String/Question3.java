package String;

public class Question3 {
    public static void main(String[] args) {
        String s = "THIS IS is  the THE program of find duplicate word in program";
        s = s.toLowerCase();
        String[] words = s.split(" ");
        int count = 0;
        System.out.println("Duplicate words in the given string:");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    // Set words[j] to "0" to avoid printing visited word
                    words[j] = "0";
                }
            }
            if (count > 1 && !words[i].equals("0")) {
                System.out.println(words[i]);
            }
        }
    }
}