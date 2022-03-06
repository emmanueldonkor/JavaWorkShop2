import java.util.Random;
public class EvenOrNotEven {
    public static void main(String[] args){
        //Generating random numbers between 1 and 100 using random class
        Random rand = new Random();
        int randomNumber = (int)rand.nextInt(1,100);
        //Check if it's odd or even
        if(randomNumber % 2 == 0){
            System.out.println( randomNumber+" is an even number");
        }
        else{
            System.out.println( randomNumber+" is and odd number");
        }
    }
}
