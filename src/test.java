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
        String day=dd.format(new Date());//����
        String clockInTime=day+" 9:30:00";//�涨��ʱ��
        SimpleDateFormat ff=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=ff.format(new Date());//��ǰ��ʱ��
        try {
            long beigin=ff.parse(clockInTime).getTime();
            long last=ff.parse(time).getTime();
            int minute=(int)((last-beigin)/1000*60*60);
            if(minute<=0){
                System.out.println("�򿨳ɹ�");
            }else {
                System.out.println("��ʧ��");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
