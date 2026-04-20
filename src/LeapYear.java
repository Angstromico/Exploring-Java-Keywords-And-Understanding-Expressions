public class LeapYear {
    public static boolean isLeapYear(int year) {

        // Step 1: Check if the year is within the valid range (1 to 9999)
        if (year < 1 || year > 9999) {
            return false;
        }

        // Step 2: Apply the leap year logic
        // A year is a leap year if:
        // - It is divisible by 4, but NOT divisible by 100, OR
        // - It is divisible by 400

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    // ================== MAIN METHOD FOR TESTING ==================
    public static void main(String[] args) {

        System.out.println("=== Leap Year Test Examples ===");

        System.out.println("isLeapYear(-1600) = " + isLeapYear(-1600));   // false
        System.out.println("isLeapYear(1600)  = " + isLeapYear(1600));    // true
        System.out.println("isLeapYear(2017)  = " + isLeapYear(2017));    // false
        System.out.println("isLeapYear(2000)  = " + isLeapYear(2000));    // true
        System.out.println("isLeapYear(2024)  = " + isLeapYear(2024));    // true
        System.out.println("isLeapYear(1900)  = " + isLeapYear(1900));    // false
        System.out.println("isLeapYear(2400)  = " + isLeapYear(2400));    // true
        System.out.println("isLeapYear(9999)  = " + isLeapYear(9999));    // false
        System.out.println("isLeapYear(1)     = " + isLeapYear(1));       // false
        System.out.println("isLeapYear(400)   = " + isLeapYear(400));     // true
    }
}
