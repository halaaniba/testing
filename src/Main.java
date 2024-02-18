import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String input = "2023-03-01T13:00:00Z";


        OffsetDateTime dateTime = OffsetDateTime.parse(input, DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        String formattedDate = dateTime.format(formatter);

        System.out.println(formattedDate); // Stampa "01 marzo 2023"
    }
}
