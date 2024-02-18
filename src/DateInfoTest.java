import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateInfoTest {

    @Test
    public void testDateInfo() {
        String input = "2023-03-01T13:00:00Z";
        ZonedDateTime dateTime = ZonedDateTime.parse(input, DateTimeFormatter.ISO_DATE_TIME);

        assertEquals(2023, dateTime.getYear());
        assertEquals(3, dateTime.getMonthValue());
        assertEquals(1, dateTime.getDayOfMonth());
        assertEquals("mercoledì", dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN));
    }
}
