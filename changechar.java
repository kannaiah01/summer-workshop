import java.util.Scanner;

public class changechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);

        if (ch >= 97 && ch <= 122) {
            System.out.println("Capital Letter: " + (char)(ch - 32));
        }
        else if (ch >= 65 && ch <= 90) {
            System.out.println("Small Letter: " + (char)(ch + 32));
        }
        else {
            System.out.println("Not an alphabet");
        }
    }
}