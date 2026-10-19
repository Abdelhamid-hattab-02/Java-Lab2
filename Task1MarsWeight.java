public class Task1MarsWeight {

    static float earthWeightHattab = 92.0f;
    static float marsGravityHattab = 0.38f;
    static double marsWeightHattab;
    static int marsWeightIntHattab;
    static char marsWeightCharHattab;
    static int charResultHattab;

    public static void main(String[] args) {
        marsWeightHattab = earthWeightHattab * marsGravityHattab;
        System.out.println("Weight on Mars calculated and assigned to a double variable.");

        System.out.printf("Weight on Mars (double, 4 decimal places): %.4f%n", marsWeightHattab);

        marsWeightIntHattab = (int) marsWeightHattab;
        System.out.println("Double cast to int: " + marsWeightIntHattab);

        marsWeightCharHattab = (char) marsWeightIntHattab;
        System.out.println("Int cast to char: " + marsWeightCharHattab);

        charResultHattab = marsWeightCharHattab + 10;
        System.out.println("Char + 10 assigned to a new int: " + charResultHattab);
    }
}
