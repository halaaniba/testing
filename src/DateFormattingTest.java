import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFormattingTest {

    @Test
    public void testDateFormatting() {
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(input, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        String formattedDate = dateTime.format(formatter);

        assertEquals("01 marzo 2023", formattedDate);
    }
}

