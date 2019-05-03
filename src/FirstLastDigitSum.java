public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));


    }

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = 0;

        if(number >= 10){last = number % 10;}
        else{last = number;}

        if(number < 10){first = number;}
        else{first = 0;}

        int sum = 0;

        while(number >= 10){
            first = number / 10;
            number = number / 10;
        }

        if(number < 0){sum = -1;}
        else {sum = first + last;}

        System.out.println(first + "+" + last);




    return sum;}
}
