import java.util.Locale;

public class Task1MarsWeight {

    static float earthWeightHattab = 92.0f;
    static float marsGravityRatioHattab = 0.38f;
    static double marsWeightHattab;
    static int marsWeightIntHattab;
    static char marsWeightCharHattab;
    static int charOperationResultHattab;

    public static void main(String[] args) {
        System.out.println("Weight on Earth (float): " + earthWeightHattab + " kg");
        System.out.println("Mars gravity ratio (float): " + marsGravityRatioHattab);

        marsWeightHattab = earthWeightHattab * marsGravityRatioHattab;
        System.out.println("Calculated weight on Mars and assigned it to a double variable.");

        System.out.println("Weight on Mars (double, 4 decimal places): "
                + String.format(Locale.US, "%.4f", marsWeightHattab) + " kg");

        marsWeightIntHattab = (int) marsWeightHattab;
        System.out.println("Cast double to int (decimal part is cut off): " + marsWeightIntHattab);

        marsWeightCharHattab = (char) marsWeightIntHattab;
        if (Character.isISOControl(marsWeightCharHattab)) {
            System.out.println("Cast int to char: Unicode code " + (int) marsWeightCharHattab
                    + " (a non-printable control character)");
        } else {
            System.out.println("Cast int to char: '" + marsWeightCharHattab + "' (Unicode code "
                    + (int) marsWeightCharHattab + ")");
        }

        charOperationResultHattab = marsWeightCharHattab + 10;
        System.out.println("Added 10 to the char (char is promoted to int): "
                + (int) marsWeightCharHattab + " + 10 = " + charOperationResultHattab);
    }
}
