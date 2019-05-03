public class NumberPalindrome {


    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int regular = Math.abs(number);
        number = Math.abs(number);

//        if(number < 10){
//            return false;
//        }

        while(number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + Math.abs(lastDigit);
            number = number / 10;

        }
        boolean ret = false;

        if(reverse == regular){
            ret = true;
        } else {ret = false;}

    return ret;}


}
