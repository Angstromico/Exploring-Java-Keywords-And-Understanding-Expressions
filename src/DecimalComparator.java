public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int int1 = (int) (number1 * 1000);
        int int2 = (int) (number2 * 1000);

        return int1 == int2;
    }

    // ================== MAIN METHOD FOR TESTING ==================
    public static void main(String[] args) {

        System.out.println("=== Decimal Comparator Tests ===");

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));   // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));      // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));          // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));     // false
        System.out.println(areEqualByThreeDecimalPlaces(2.9999, 3.000));     // false
        System.out.println(areEqualByThreeDecimalPlaces(-0.0001, 0.0001));   // false
        System.out.println(areEqualByThreeDecimalPlaces(5.12345, 5.123));    // true
    }
}
