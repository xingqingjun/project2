import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Machenike on 2018/10/20.
 */
public class test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd");
        String day=dd.format(new Date());//今天
        String clockInTime=day+" 9:30:00";//规定打卡时间
        SimpleDateFormat ff=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=ff.format(new Date());//当前打卡时间
        try {
            long beigin=ff.parse(clockInTime).getTime();
            long last=ff.parse(time).getTime();
            int minute=(int)((last-beigin)/1000*60*60);
            if(minute<=0){
                System.out.println("打卡成功");
            }else {
                System.out.println("打卡失败");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
