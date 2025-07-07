import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Period;

public class Ex87 {
    public static void main(String[] args) {
        // LocalDate: 날짜만 다루는 클래스
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // 특정 날짜 생성
        LocalDate specificDate = LocalDate.of(2023, 10, 1);
        System.out.println("Specific date: " + specificDate);

        // LocalTime: 시간만 다루는 클래스
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current time: " + nowTime);

        // 특정 시간 생성
        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println("Specific time: " + specificTime);

        // LocalDateTime: 날짜와 시간을 다루는 클래스
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTimeNow);

        // 특정 날짜와 시간 생성
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 10, 1, 14, 30);
        System.out.println("Specific date and time: " + specificDateTime);

        // ZonedDateTime: 타임존이 포함된 날짜와 시간을 다루는 클래스
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("Current date, time, and zone: " + zonedDateTimeNow);

        // Duration: 두 시간 사이의 차이를 표현하는 클래스 (초, 나노초 단위)
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration between " + startTime + " and " + endTime + ": " + duration.toHours() + " hours");

        // Period: 두 날짜 사이의 차이를 표현하는 클래스 (일수 단위)
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 10, 1);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between " + startDate + " and " + endDate + ": " + period.getMonths()
                + " months and " + period.getDays() + " days");
    }
}
