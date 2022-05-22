public class Main {

    public static String printDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {

            case 1:
                return "Poniedziałek";
            case 2:
                return "Wtorek";
            case 3:
                return "środa";
            case 4:
                return "Czwartek";
            case 5:
               return "Piątek";
            case 6:
            case 7:
               return "Weekend";
            default:
                return "There is no such a day!";

        }

    }

    }


