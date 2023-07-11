package usefulFunction;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class utill {
    private static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void dateValidator() {
        pattern = Pattern.compile(DATE_PATTERN);
    }
    public static boolean validate(String date) {

        matcher = pattern.matcher(date);

        if (matcher.matches()) {

            matcher.reset();

            if (matcher.find()) {
                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if ("31".equals(day)) {
                    // 31 дeнь moжeт быть тoльko в mecяцaх
                    // 1, 3, 5, 7, 8, 10, 12
                    return Arrays.asList(new String[]{"1", "01", "3", "03",
                                    "5", "05", "7", "07", "8", "08", "10", "12"})
                            .contains(month);

                } else if ("2".equals(month) || "02".equals(month)) {
                    // Пpoвepяem фeвpaль
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                // Виcokocный гoд
                                return Integer.parseInt(day) <= 29;
                            }
                            // Нeвиcokocный гoд
                            return Integer.parseInt(day) <= 28;
                        }
                        // Виcokocный гoд
                        return Integer.parseInt(day) <= 29;
                    } else {
                        // Нeвиcokocный гoд
                        return Integer.parseInt(day) <= 28;
                    }

                } else {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        dateValidator();
        System.out.println(validate("23.06.20") + " Создано: 23.06.20 в 12:23");
    }
}
