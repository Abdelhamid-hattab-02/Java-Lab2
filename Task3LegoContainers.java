public class Task3LegoContainers {

    public static void main(String[] args) {
        int amountOfBricks = 87;
        int containerCapacity = 6;
        System.out.println("Amount of bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Full containers: " + fullContainers);

        int bricksInLastContainer = amountOfBricks % containerCapacity;
        System.out.println("Bricks in the container that is not full: " + bricksInLastContainer);

        int allContainers = bricksInLastContainer > 0 ? fullContainers + 1 : fullContainers;
        System.out.println("All containers (full and not full): " + allContainers);
    }
}
