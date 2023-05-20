package _01_day;

public class TimeConversion {
    public static String timeConversion(String s) {
        String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2].substring(0, 2));
        String period = parts[2].substring(2);

        if (hour == 12) {
            hour = 0;
        }

        if (period.equalsIgnoreCase("PM")) {
            hour += 12;
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
