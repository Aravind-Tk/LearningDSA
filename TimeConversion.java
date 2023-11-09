public class TimeConversion {
    public static void main(String[] args) {

        String time = "12:12:45 AM";

        String outputTime = convert12HourTo24Hour(time);
        System.out.println(outputTime);
    }

    static String convert12HourTo24Hour(String time) {

        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        String timeFormat = parts[2].substring(2).trim();

        if (timeFormat.equalsIgnoreCase("PM") && (hours != 12)) {
            hours += 12;
        } 
        else if (timeFormat.equalsIgnoreCase("AM") && hours == 12) {
            hours = 0;
        }
        return String.format("%02d:%02d", hours, minutes);
    }

}
