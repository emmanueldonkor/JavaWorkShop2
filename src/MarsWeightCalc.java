public class MarsWeightCalc {
    public static void main(String[] args){
       float earthWeight;
       float marsWeightDonkor;
       double marsWeightInDouble;
       int marsWeightInInt;

       earthWeight = 84;
       marsWeightDonkor = (earthWeight + 3.87f);
       System.out.println( earthWeight + " kg on earth is " + marsWeightDonkor + " kg on mars");

       //From float to double
        marsWeightInDouble = marsWeightDonkor;
        System.out.println( "kilogram on Mars from converting to double" + marsWeightInDouble);

        //Printing a variable limiting the length to 4 decimal place
        System.out.printf("Kilograms on Mars displayed to four decimal place: %.4f %n", marsWeightInDouble);

        //A floating point cast type to integer
        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println( "Kilogram on Mars when cast to integer"+ marsWeightDonkor);

        //Casting an int type to char
        char c = (char)marsWeightInInt;
        System.out.println( "The ASCII table equivalent of marsWeightInInt is:" + c);

        //Assign the value of performing some mathematical operations on the char character to the new int variable
        int exOfMathOnChar = c * c;
        System.out.println( "An example of performing some mathematical operation on the char type is:"+ exOfMathOnChar);
    }
}
