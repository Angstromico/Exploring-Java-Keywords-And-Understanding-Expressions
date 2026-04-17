public class Exercise1 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Calculate megabytes and remaining kilobytes
        int megaBytes = kiloBytes / 1024;        // Integer division
        int remainingKiloBytes = kiloBytes % 1024; // Remainder operator

        // Print in exact required format
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}
