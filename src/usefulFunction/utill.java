package usefulFunction;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.ValueRange;

public class utill {

    public static void main(String[] args) {
        Clock clock = Clock.system(ZoneId.of("Europe/Moscow"));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");
        LocalDateTime ldt2 = LocalDateTime.now(clock);
        String foramttedString = ldt2.format(format);
        System.out.println(foramttedString);
    }
}
