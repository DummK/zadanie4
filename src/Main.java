import java.util.Scanner;

public class Main {
    private final static int adminCode = 1234;
    private final static int userCode = 5744;

    public static boolean isAdmin(int x){
        return x == adminCode;
    }
    public static boolean isUser(int x) {
        return x == userCode;
    }
    public static void hasAccess(int x) {
        if(isAdmin(x) || isUser(x)) {
            System.out.println("Przyznano dostęp dla...");
                if(isAdmin(x)) {
                    System.out.println(" admina");
                }
                else {
                    System.out.println(" użytkownika");
                }
        }
        else{
            System.out.println("Odmowa dostępu");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj kod: ");
        int code = scan.nextInt();
        hasAccess(code);
    }
}