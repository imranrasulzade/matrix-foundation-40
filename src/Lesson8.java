import java.util.Arrays;

public class Lesson8 {


    static int countVowels(String text) {
        int count = 0;
        char[] vowels = {'a', 'i', 'o', 'u', 'e', 'A', 'I', 'O', 'U', 'E'};
        char[] textLetters = text.toCharArray();

        for (char textLetter : textLetters) {
            for (char vowel : vowels) {
                if (textLetter == vowel) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {


        System.out.println(countVowels("Azerbaycan"));

    }
}
