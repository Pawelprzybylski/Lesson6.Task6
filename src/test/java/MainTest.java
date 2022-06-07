import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnMonday() {
        //given
        int monday = 1;
        //when
        String mondayExpected = Main.getDayOfWeek(monday);
        //then
        Assertions.assertEquals(mondayExpected, "Monday");
    }

    @Test
    void shouldReturnTuesday() {
        //given
        int tuesday = 2;
        //when
        String tuesdayExpected = Main.getDayOfWeek(tuesday);
        //then
        Assertions.assertEquals(tuesdayExpected, "Tuesday");
    }

    @Test
    void shouldReturnWednesday() {
        //given
        int wednesday = 3;
        //when
        String wednesdayExpected = Main.getDayOfWeek(wednesday);
        //then
        Assertions.assertEquals(wednesdayExpected, "Wednesday");
    }

    @Test
    void shouldReturnThursday() {
        //given
        int thursday = 4;
        //when
        String thursdayExpected = Main.getDayOfWeek(thursday);
        //then
        Assertions.assertEquals(thursdayExpected, "Thursday");
    }

    @Test
    void shouldReturnFriday() {
        //given
        int friday = 5;
        //when
        String fridayExpected = Main.getDayOfWeek(friday);
        //then
        Assertions.assertEquals(fridayExpected, "Friday");
    }

    @Test
    void shouldReturnSaturday() {
        //given
        int saturday = 6;
        //when
        String weekendExpectedOnSaturday = Main.getDayOfWeek(saturday);
        //then
        Assertions.assertEquals(weekendExpectedOnSaturday, "Saturday");
    }

    @Test
    void shouldReturnSunday() {
        //given
        int sunday = 7;
        //when
        String weekendExpectedOnSunday = Main.getDayOfWeek(sunday);
        //then
        Assertions.assertEquals(weekendExpectedOnSunday, "Sunday");
    }

    @Test
    void shouldReturnWrongDay() {
        //given
        int wrongDay = 25;
        //when
        String wrongDayExpected = Main.getDayOfWeek(wrongDay);
        //then
        Assertions.assertEquals(wrongDayExpected, "There is no such a Day");
    }

}






