package String;

public class Question1 {
    public static void main(String[] args)
    {
        String s = "525";
        int i=0;
        int j=s.length()-1;
        int rev=0;

        while(i<j && rev==0)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                rev=1;
                break;
            }
            i++;
            j--;
        }

        if(rev==0)
        {
            System.out.println("is pallindrome:");
        }

        else
        {
            System.out.println("is'not pallindrome:");
        }

    }
}


