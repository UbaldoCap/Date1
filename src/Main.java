import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dataShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println(dataFull);
        System.out.println(dataMedium);
        System.out.println(dataShort);
    }
}
