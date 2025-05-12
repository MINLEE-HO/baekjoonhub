import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] argv){
        LocalDate nowD = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.print(nowD);
    }
}
