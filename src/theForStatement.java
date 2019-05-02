public class theForStatement {
    public static void main(String[] args) {

//        for(int i=8; i>=2; i--){
//            System.out.println(String.format("%.2f", calculateInterest(10000.0, (double) i)));
//        }

        int count = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i)){count++;}else{continue;}
            System.out.println(i + " prime is " + isPrime(i));
            if(count == 10){break;}
        }
        System.out.println(count);

        int sum = 0;
        int count1 = 0;
        for(int i=1; i<=1000; i++){
            if(is35(i)){sum += i; count1++;}else{continue;}
            if(count1 >= 5){break;}
        }
        System.out.println(sum);

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount*(interestRate/100));
    }

    public static boolean is35(int n) {

        for(int i=3; i <= n; i++){
            if(n % 3 == 0 && n % 5 == 0){
                return true;
            }
        }

        return false;

    }

    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
