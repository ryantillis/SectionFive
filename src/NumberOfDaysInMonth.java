public class NumberOfDaysInMonth {

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

    public static int getDaysInMonth(int month, int year) {
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



