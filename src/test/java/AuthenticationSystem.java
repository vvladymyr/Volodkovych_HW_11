import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть ім'я користувача: ");
            String username = scanner.nextLine();
            System.out.print("Введіть пароль: ");
            String password = scanner.nextLine();

            SignIn.authenticateUser(username, password);
        } catch (InvalidInputException e) {
            System.err.println("Помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


}