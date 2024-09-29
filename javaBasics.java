import java.util.Scanner;

public class javaBasics {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is name? ");

        String name = in.nextLine();

        System.out.println("What is second name? ");
        String surname = in.nextLine();
        in.close();

        System.out.println("Hello " + name + " " + surname);
    }
}
