import java.util.Scanner;

public class Charpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();

        String result = createCode(word);
        System.out.println(result);

        sc.close();
    }

    public static String createCode(String word) {
        // Write your code here
        String ans = "";
        for (int i = 0; i < word.length(); i++) {
            ans = ans + word.charAt(i) + (i + 1);
        }
        return ans;
    }
}
