public class CalculateTimeUnits {
    public static void main(String[] args) {
        // Viability Tests
        System.out.println("--- Success tests ---");
        System.out.println(getDurationString(3945));           // 1h 5m 45s
        System.out.println(getDurationString(65, 45));         // 1h 5m 45s

        System.out.println("\n--- Pruebas de Validación ---");
        System.out.println(getDurationString(-10));            // Error negative seconds
        System.out.println(getDurationString(-5, 20));         // Error negative minutes
        System.out.println(getDurationString(10, 65));         // Error seconds > 60
    }

    private static final int secondsHour = 60;

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Error: The seconds value (" + seconds + ") much be greater or equal to zero.";
        }

        int minutes = seconds / secondsHour;
        int remainingSeconds = seconds % secondsHour;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Error: The minutes (" + minutes + ") much be a positive number.";
        }
        if (seconds < 0 || seconds > 60) {
            return "Error: Seconds (" + seconds + ") much be in the range between 0 and 60.";
        }

        int hours = minutes / secondsHour;
        int remainingMinutes = minutes % secondsHour;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
