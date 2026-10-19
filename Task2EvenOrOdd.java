public class Task2EvenOrOdd {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Generated a random number between 1 and 100: " + randomNumber);

        int remainder = randomNumber % 2;
        System.out.println("Calculated " + randomNumber + " % 2 = " + remainder);

        if (remainder == 0) {
            System.out.println("The remainder is 0, so " + randomNumber + " is an EVEN number.");
        } else {
            System.out.println("The remainder is 1, so " + randomNumber + " is an ODD number.");
        }
    }
}
