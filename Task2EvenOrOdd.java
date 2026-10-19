public class Task2EvenOrOdd {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;
        System.out.println("Random number between 1 and 100: " + number);

        if (number % 2 == 0) {
            System.out.println(number + " % 2 = 0, so the number is even.");
        } else {
            System.out.println(number + " % 2 = 1, so the number is odd.");
        }
    }
}
