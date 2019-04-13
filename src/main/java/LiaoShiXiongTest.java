import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class LiaoShiXiongTest {


    public static void main(String[] args) {

//         base
      /*  String sun = "sun";

        System.out.println(Base64.getEncoder().encodeToString(sun.getBytes()));


        System.out.println(new String(Base64.getDecoder().decode("c3Vu")));
*/
/*

        Integer[] integers = {5555, 55, 5, 555555};


        Date date = new Date();

        int i = date.compareTo(new Date(55555555));
        System.out.println(i);

        List<Integer> collect = Arrays.stream(integers).sorted(Integer::compareTo).collect(Collectors.toList());

        String sun = "sun";
        int s = sun.compareTo("s");

        System.out.println(s);

        System.out.println(collect);
        Arrays.sort(integers);

        System.out.println(integers.length);

*/

        LocalDate now = LocalDate.now();

        LocalDateTime now1 = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now1)

        ;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        String format = dateTimeFormatter.format(now1);
        System.out.println(format);
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);


    }


}

