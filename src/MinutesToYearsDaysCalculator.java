public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);   // 1 and 0 d
        printYearsAndDays(1051200);  // 2 and 0 d
        printYearsAndDays(561600);   // 1 and 25 d
        printYearsAndDays(-525600);  // Invalid Value
    }

    private static final int minutesInAnHour = 60;
    private static final int hoursInAnDay = 24;
    private static final int daysInAYear = 365;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / minutesInAnHour;
            long days = hours / hoursInAnDay;

            long years = days / daysInAYear;
            long remainingDays = days % daysInAYear;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
