package ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(login)) {
                result = users[i];
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("User Not Found");
        }

        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        int length = user.getUsername().length();
        boolean result = user.isValid() && length >= 3;
        if (!result) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Roman", true),
                new User("Vovan", true),
                new User("Kolyan", false),
                new User("Ян", true)
        };
        User user = null;
        try {
            user = findUser(users, "Kolya");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ex) {
            System.out.println(ex.getMessage());
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
