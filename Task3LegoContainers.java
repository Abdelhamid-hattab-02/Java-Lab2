public class Task3LegoContainers {

    public static void main(String[] args) {
        int amountOfBricks = 87;
        int containerCapacity = 6;
        System.out.println("We have " + amountOfBricks + " Lego bricks.");
        System.out.println("One container holds " + containerCapacity + " bricks.");

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Full containers (" + amountOfBricks + " / " + containerCapacity + "): "
                + fullContainers);

        int bricksInLastContainer = amountOfBricks % containerCapacity;
        System.out.println("Bricks in the container that is not full (" + amountOfBricks + " % "
                + containerCapacity + "): " + bricksInLastContainer);

        int allContainers = fullContainers + (bricksInLastContainer > 0 ? 1 : 0);
        System.out.println("Containers in general (full and not full): " + allContainers);
    }
}
