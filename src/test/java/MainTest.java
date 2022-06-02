import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnMonday() {
        //given
        int monday = 1;
        //when
        String mondayExpected = Main.printDayOfWeek(monday);
        //then
        Assertions.assertEquals(mondayExpected, "Monday");
    }

    @Test
    void shouldReturnTuesday() {
        //given
        int tuesday = 2;
        //when
        String tuesdayExpected = Main.printDayOfWeek(tuesday);
        //then
        Assertions.assertEquals(tuesdayExpected, "Tuesday");
    }

    @Test
    void shouldReturnWednesday() {
        //given
        int wednesday = 3;
        //when
        String wednesdayExpected = Main.printDayOfWeek(wednesday);
        //then
        Assertions.assertEquals(wednesdayExpected, "Wednesday");
    }

    @Test
    void shouldReturnThursday() {
        //given
        int thursday = 4;
        //when
        String thursdayExpected = Main.printDayOfWeek(thursday);
        //then
        Assertions.assertEquals(thursdayExpected, "Thursday");
    }

    @Test
    void shouldReturnFriday() {
        //given
        int friday = 5;
        //when
        String fridayExpected = Main.printDayOfWeek(friday);
        //then
        Assertions.assertEquals(fridayExpected, "Friday");
    }

    @Test
    void shouldReturnWeekend() {
        //given
        int saturday = 6;
        int sunday = 7;
        //when
        String weekendExpectedOnSaturday = Main.printDayOfWeek(saturday);
        String weekendExpectedOnSunday = Main.printDayOfWeek(sunday);
        //then
        Assertions.assertEquals(weekendExpectedOnSaturday, "Saturday");
        Assertions.assertEquals(weekendExpectedOnSunday, "Sunday");
    }

    @Test
    void shouldReturnWrongDay() {
        //given
        int wrongDay = 25;
        //when
        String wrongDayExpected = Main.printDayOfWeek(wrongDay);
        //then
        Assertions.assertEquals(wrongDayExpected, "There is no such a Day");
    }

}






