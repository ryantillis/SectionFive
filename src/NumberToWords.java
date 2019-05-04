public class NumberToWords {

    public static void numberToWords(int number) {
        //Negative or Zero value
        if(number < 0){System.out.println("Invalid Value");}
        if(number == 0){System.out.println("Zero");}

        //Initialize String
        String numberOut = "";

        //Reverse Number
        int revNum = reverse(number);
        //System.out.println("Reversed: " + revNum + " Regular: " + number);

        //Get number of zeroes to add
        int diffNum = getDigitCount(number) - getDigitCount(revNum);

        //While loop reduced by dividing number by 10 each iteration until it is equal to 0
        while(revNum > 0){
            //Grab last digit from reversed number
            int lastDigit = revNum % 10;

            //Switch on last digit to concatenate word value of digit
            switch(lastDigit){
                case 1:
                    numberOut += "One ";
                    break;
                case 2:
                    numberOut += "Two ";
                    break;
                case 3:
                    numberOut += "Three ";
                    break;
                case 4:
                    numberOut += "Four ";
                    break;
                case 5:
                    numberOut += "Five ";
                    break;
                case 6:
                    numberOut += "Six ";
                    break;
                case 7:
                    numberOut += "Seven ";
                    break;
                case 8:
                    numberOut += "Eight ";
                    break;
                case 9:
                    numberOut += "Nine ";
                    break;
                case 0:
                    numberOut += "Zero ";
                    break;
                default:
                    break;
            }

            //Reduce number by one digit to count down iterations and move through digits
            revNum = revNum / 10;

        }

        //Check the length of the reversed number and add zeros to make up for the difference
        for(int i = 1; i <= diffNum; i++){
            numberOut += "Zero ";
        }

        //Print out result
        System.out.println(numberOut);}



    //METHOD TO REVERSE NUMBER

    public static int reverse(int number) {
        //Reverse number
        int reverse = 0;

        int minus = 1;
        if(number < 0){minus = -1;}

        number = Math.abs(number);

        while(number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + Math.abs(lastDigit);
            number = number / 10;
        }

    return reverse*minus;}



    //METHOD TO GET COUNT OF DIGITS

    public static int getDigitCount(int number) {
        //Return number of digits in number
        if(number < 0){return -1;}
        int count = 0;

        do{
            number = number / 10;
            count++;
        }
        while(number > 0);

    return count;}

}
