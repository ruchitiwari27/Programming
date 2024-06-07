package String;

public class Question10 {
    public static void main(String[]args){
        String s="ksjdhujhf";

        boolean containsOnlyLetters = true;
        for (char ch : s.toCharArray()) {
            if (!Character.isLetter(ch)) {
                containsOnlyLetters = false;
                break;
            }
        }
        System.out.println("Contains only Letters: " + containsOnlyLetters);
    }

}
