
package String;
public class Question5 {
    public static void main(String[] args) {
        String s = "this is the program program to find the duplicate words occurrence";
        int count;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            if (!words[i].equals("0")) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        count++; // Increment count
                        words[j] = "0"; // Mark the word as counted
                    }
                }
                // If the count is greater than 1, it's a duplicate word
                if (count > 1) {
                    System.out.println("Occurrence of word '" + words[i] + "' is: " + count);
                }
            }
        }
    }
}


