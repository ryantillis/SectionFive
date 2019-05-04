public class PerfectNumber {

    //Sum of positive divisors equal to number, excluding number itself
    //example 1+2+3=6

    public static boolean isPerfectNumber(int number) {

        if(number < 1){return false;}

        int perfectCount = 0;

        for(int i=1; i <= number; i++){
            if(number % i == 0 && i != number){perfectCount += i;}
        }

        if(perfectCount == number){return true;}
        else{return false;}

    }

}
