package String;

public class Question6 {
    public static void main(String[]args){
    String s ="this is the program";
    int vowelcount=0;
    int conscount=0;
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
            } else {
                conscount++;
            }
        }
    }

    System.out.println("Number of vowels: " + vowelcount);
    System.out.println("Number of consonants: " + conscount);
}
}


