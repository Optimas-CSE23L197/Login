# Swing Login Application

This is a simple Swing-based login application in Java. It demonstrates the use of Swing components to create a graphical user interface for user login.

## Project Structure

- `Main.java`: The entry point of the application.
- `Login.java`: The login form where users enter their credentials.
- `WelcomePage.java`: The welcome page displayed after a successful login.
- `IdPassword.java`: A class that stores user IDs and passwords.

## How to Run

1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE.
3. Run the `Main.java` file.

## Classes and Their Responsibilities

### Main.java

```java
package Login;

public class Main {
    public static void main(String[] args) {
        IdPassword idPassword = new IdPassword();
        Login login = new Login(idPassword.getLogininfo());
    }
}
