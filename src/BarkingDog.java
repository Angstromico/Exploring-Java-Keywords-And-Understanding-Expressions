public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // First check if hourOfDay is valid (must be between 0 and 23 inclusive)
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // Wake up if the dog is barking AND (it's before 8 OR after 22)
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        // In all other cases, do not wake up
        return false;
    }
}
