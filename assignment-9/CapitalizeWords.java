import java.util.*;
class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String words[] = sentence.split(" ");
        String result = "";
        for (String w : words) {
            if (w.length() > 0) {
                result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
            }
        }
        System.out.println(result.trim());
    }
}
