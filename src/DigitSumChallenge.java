public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(444));
    }

    public static int sumDigits(int number) {
        // n% 10 to extract least significant digit
        // n = n/10 to remove least significant
        int digitSum = 0;

        if(number < 10){
            return -1;
        }

        while(number > 0){
            int lsd = number % 10;
            digitSum += lsd;
            number = number / 10;

        }

    return digitSum;}

}
