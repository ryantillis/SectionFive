public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        int last1 = number1 % 10;
        int last2 = number2 % 10;
        int last3 = number3 % 10;

        if(!isValid(number1) || !isValid(number1) || !isValid(number1)){return false;}
        else if(last1 == last2 || last1 == last3 || last2 == last3){
            return true;
        } else {return false;}

    }


    public static boolean isValid(int number) {
        if(number > 1000 || number < 10)
        {return false;} else {return true;}
    }

}
