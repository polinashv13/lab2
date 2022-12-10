import java.util.Scanner;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Дата:");
        String date = scan.nextLine();
        Pattern p = Pattern.compile("(?:[0-9]{2}[\\/]){2}[0-9]{4}");
        Matcher m = p.matcher(date);
        boolean check = m.matches();
        if (!check) {
           System.out.print("Введённое выражение не соответствует формату даты dd/mm/yyyy");
            return;
           }
        int year = Integer.parseInt(date.substring(6,10));
        if (year < 1900) {
            System.out.print("Введенное выражение не является датой");
            return;
        }
        int month = Integer.parseInt(date.substring(3,4));
        if (month > 12 || month == 0) {
            System.out.print("Введенное выражение не является датой");
            return;
        }
        Calendar calen = new GregorianCalendar();
        calen.set(year, month - 1, 1);
        int day = Integer.parseInt(date.substring(0,1));
        if (day > calen.getActualMaximum(Calendar.DAY_OF_MONTH)) {
            System.out.print("Введенное выражение не является датой");
            return;
        }

        System.out.print("Введённое выражение является датой");
    }
    }
