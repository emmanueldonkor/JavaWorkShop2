public class ContainersForBlocksNeed {
    public static void main(String[] args){
        //odd number of legos we have
        int amountOfBricks =91;

        //even number of legos that fit in one container
        int containerCapacity = 8;

        //Calculation of how many containers not full
        int containersUnfilled = amountOfBricks % containerCapacity;
        System.out.println("The number of unfilled containers will be " + containersUnfilled);

        //Filled containers
        int filledContainers = amountOfBricks / containerCapacity;
        System.out.printf("Number of filled containers: " + filledContainers);

        //The amount of containers both full and not full
        System.out.println(" ");
        int totalContainers = filledContainers + containersUnfilled;
        System.out.println("Number of containers in total are " + totalContainers);



    }
}
