
package String;
public class Question4 {
    public static void main(String[] args) {
        String s = "this  is  the program of count occurence of words";
        int count = 0;
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            if (!words[i].equals("0")) {
                for (int j = i + 1; j < words.length; j++) {
                    // If the current word equals the next word
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = "0"; // Mark the word as counted
                    }
                }
                System.out.println("Word '" + words[i] + "' occurs " + count + " times.");
            }
        }
    }
}
