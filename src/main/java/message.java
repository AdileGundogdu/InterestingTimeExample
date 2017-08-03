import java.util.Calendar;
import java.util.Date;

public class message {
    public static class Message {

        public static Date date;

        public static Date date(){
            date = new Date();
            return date;
        }

        public static Calendar calendar(){
            return Calendar.getInstance();
        }

    }
}
