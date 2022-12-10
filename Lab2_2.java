import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab2_2 {
    static boolean password(String pass) {
        Pattern p1 = Pattern.compile("(?=[a-zA-Z0-9_]){8,}");
        Matcher m1 = p1.matcher(pass);
        if (!m1.matches()) {
            System.out.println("Пароль ненадёжен");
            return false;
        }

        Pattern p2 = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}");
        Matcher m2 = p2.matcher(pass);
        if (!m2.matches()) {
            System.out.println("Пароль ненадёжен");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean right = false;

        do {
            System.out.print("Введите пароль: ");
            String pass = scan.nextLine();
            right = password(pass);
        } while (!right);

            System.out.print("Пароль надёжен");
    }
    }
