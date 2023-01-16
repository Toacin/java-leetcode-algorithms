package HackerRank;

public class TimeConverstion {
    public static void convertedTime(String s) {
        int hour = Integer.parseInt(s.substring(0,2));
        String amPM = s.substring(s.length()-2);

        if (amPM.equals("AM")) {
            hour = (hour == 12) ? 0: hour;
        } else {
            hour = (hour==12) ? 12: hour+12;
        }

        String hourStringified = (hour<10) ? "0" + hour: String.valueOf(hour);

        System.out.println(hourStringified+s.substring(2, s.length()-2));
    }

    public static void main(String[] args) {
        convertedTime("03:05:45AM");
        convertedTime("04:59:59AM");
    }
}
