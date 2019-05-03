public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(10,5));
    }

    public static boolean isOdd(int number) {
        if(number < 0){return false;}
        else if(number % 2 == 0){return false;}
        else {return true;}

    }

    public static int sumOdd(int start, int end) {
        int oddSum = 0;
        if(start > end || end < 0 || start < 0){return -1;}
        else
        for(int i = start; i <= end; i++){
            if(isOdd(i)){oddSum += i;}
        }

    return oddSum;}
}
