public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

    // ================== MAIN METHOD FOR TESTING ==================
    public static void main(String[] args) {

        System.out.println("=== Teen Number Checker Tests ===");

        // hasTeen tests
        System.out.println("hasTeen(9, 99, 19)   = " + hasTeen(9, 99, 19));    // true
        System.out.println("hasTeen(23, 15, 42)  = " + hasTeen(23, 15, 42));   // true
        System.out.println("hasTeen(22, 23, 34)  = " + hasTeen(22, 23, 34));   // false
        System.out.println("hasTeen(13, 14, 15)  = " + hasTeen(13, 14, 15));   // true

        // isTeen tests
        System.out.println("\n--- isTeen tests ---");
        System.out.println("isTeen(9)   = " + isTeen(9));     // false
        System.out.println("isTeen(13)  = " + isTeen(13));    // true
        System.out.println("isTeen(19)  = " + isTeen(19));    // true
        System.out.println("isTeen(20)  = " + isTeen(20));    // false
        System.out.println("isTeen(12)  = " + isTeen(12));    // false
    }
}
