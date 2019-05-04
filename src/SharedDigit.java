public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {
        int first1 = number1 % 10;
        int second1 = number1 / 10;
        int first2 = number2 % 10;
        int second2 = number2 / 10;

        if(number1 > 99 || number1 < 10 || number2 > 99 || number2 < 10){return false;}
        else if(first1 == first2 || first1 == second2 || second1 == first2 || second1 == second2){
            return true;
        } else {return false;}


    }

}
