import java.util.ArrayList;
public class Recursion{
    String word = "bacon";
    public static void stringR(String word){
        return word[stringR(word.length - 1)];
    }

    public static void main (String[] args)
    {
        System.out.println(stringR);
    }
    


}