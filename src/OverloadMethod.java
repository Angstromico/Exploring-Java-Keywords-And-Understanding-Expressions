public class OverloadMethod {
    public static void main(String[] args) {
        double tvSize = convertToCentimeters(55);
        System.out.println("A TV of 55 Inches is: " + tvSize + " Centimeters width");

        double basketballPlayerHeight = convertToCentimeters(6, 8);
        System.out.println("The player of 6 feet and 8 inches has a height of: " + basketballPlayerHeight + " on International units (cm)");
    }

    private static final double INCH_TO_CM = 2.54;
    private static final int FEET_TO_INCHES = 12;

    public static double convertToCentimeters(int inches) {
        return inches * INCH_TO_CM;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * FEET_TO_INCHES) + inches);
    }
}
