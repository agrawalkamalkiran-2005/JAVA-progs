import java.util.*;
class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        String words[] = name.split(" ");
        String initials = "";
        for (String w : words) {
            if (w.length() > 0) {
                initials += Character.toUpperCase(w.charAt(0));
            }
        }
        System.out.println("Your initials: " + initials);
    }
}
