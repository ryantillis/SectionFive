//import java.util.Arrays;

public class NumberOfDaysinMonth {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (((year % 4) == 0 && (year % 100 != 0)) || ((year % 100) == 0) && ((year % 400) == 0)) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    //using array contains function
//    public static boolean arrayContains(int[] array, int item){
//        int count = 0;
//        for(int i : array){
//            if(i == item){
//                count = 1;
//                break;
//            } else continue;
//        } if(count > 0){return true;} else {return false;}
//    }


    public static int getDaysInMonth(int month, int year) {
//        int month31[] = {1,3,5,7,8,10,12};
//        int month30[] = {4,6,9,11};
//        int days;
        // Declaring array literal

//        if(month<1||month>12||year<1||year>9999){
//            days = -1;
//        } else if(arrayContains(month31, month)){
//            days = 31;
//        } else if(arrayContains(month30, month)){
//            days = 30;
//        }else if(month == 2) {
//            if (isLeapYear(year)) {
//                days = 29;
//            } else {
//                days = 28;
//            }
//        } else {days = 9999;}
//
//        return days;
//    }
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (month < 1 || month > 12 || year < 1 || year > 9999) {
                    days = -1;
                    break;
                } else {
                    days = 31;
                    break;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                if (month < 1 || month > 12 || year < 1 || year > 9999) {
                    days = -1;
                    break;
                } else {
                    days = 30;
                    break;
                }

            case 2:
                if (month < 1 || month > 12 || year < 1 || year > 9999) {
                    days = -1;
                    break;
                } else {
                    if (isLeapYear(year)) {
                        days = 29;
                        break;
                    } else {
                        days = 28;
                        break;
                    }


                }
                default:
                    days = -1;
                    break;

        }
    return days;}
}



