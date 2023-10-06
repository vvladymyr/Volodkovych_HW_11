public class SignIn {

    public static void authenticateUser(String username, String password) throws InvalidInputException {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new InvalidInputException("Ім'я користувача та пароль не можуть бути порожніми чи NULL.");
        }

        if (password.length() < 6) {
            throw new InvalidInputException("Пароль повинен бути не менше 6 символів.");
        }

        String validUsername = "user123";
        String validPassword = "password123";

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new InvalidInputException("Ім'я користувача або пароль невірні.");
        }

        System.out.println("Вхід в систему успішно виконаний.");
    }
}