public class theWhileStatement {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(2));

//    int count = 1;
//    while (count != 6) {
//        System.out.println(count);
//        count++;
//    }
//

        //Do while garauntees at least one execution

//        do {
//            System.out.println(count);
//            count++;
//        } while(count!=6);

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while(number <= finishNumber){
            number++;

            if(!isEvenNumber(number)){
                //continue runs to the tops of the while loop
                continue;
            }

            count++;

            System.out.println("Even number " + number);

            if(count >= 5){
                break;}

        }

        System.out.println(count);

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {return true;}
        else {return false;}
    }







}
