import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnCorrectDayOfWeek() {
        // give
        int monday = 1;
        int tuesday = 2;
        int wednesday = 3;
        int thursday = 4;
        int friday = 5;
        int saturday = 6;
        int sunday = 7;
        int wrongDay = 24;

        //when
        String mondayExpected = Main.printDayOfWeek(monday);
        String tuesdayExpected = Main.printDayOfWeek(tuesday);
        String wednesdayExpected = Main.printDayOfWeek(wednesday);
        String thursdayExpected = Main.printDayOfWeek(thursday);
        String fridayExpected = Main.printDayOfWeek(friday);
        String weekendExpectedOnSaturday = Main.printDayOfWeek(saturday);
        String weekendExpectedOnSunday = Main.printDayOfWeek(sunday);
        String wrongDayExpected = Main.printDayOfWeek(wrongDay);


        //then
        Assertions.assertEquals(mondayExpected, "Poniedziałek");
        Assertions.assertEquals(tuesdayExpected, "Wtorek");
        Assertions.assertEquals(wednesdayExpected, "środa");
        Assertions.assertEquals(thursdayExpected, "Czwartek");
        Assertions.assertEquals(fridayExpected, "Piątek");
        Assertions.assertEquals(weekendExpectedOnSaturday, "Weekend");
        Assertions.assertEquals(weekendExpectedOnSunday, "Weekend");
        Assertions.assertEquals(wrongDayExpected, "There is no such a day!");


    }
}