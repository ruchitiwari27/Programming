
package String;

public class Question2 {
    public static void main(String[] args) {
        String s = "this is  ruchiiiiii";
        char[] ch = s.toCharArray();
        int count = 0;
        System.out.println(s);

        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != '0') { // Check duplicates and ignore already counted characters
                    System.out.println("Duplicate character: " + ch[j]);
                    count++;
                    ch[j] = '0'; // Mark the character as counted
                }
            }
        }

        System.out.println("the string "+s+" Count of duplicate characters: " + count);
    }
}
