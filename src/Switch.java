public class Switch {

//    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//    }

    public static void main(String[] args) {


        int switchValue = 6;

        //byte short char int

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, 4, or 5");
                System.out.println("was" + switchValue);
                break;

            default:
                System.out.println("Was not case");

        }


        char switchChar = 'A';

        //byte short char int string

        switch (switchChar) {
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C':
                System.out.println("C");
                break;

            default:
                System.out.println("Was not case");

        }

        String month = "January";

        //byte short char int

        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;

            default:
                System.out.println("Was not case");
                break;

        }


    }
}
