import com.demo2.tools.DateFormatUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class text1 {
    public static void main(String[] args) {
        Date d =new Date();
        System.out.println(d.toString());
        //日历类
        Calendar c=new GregorianCalendar();
        Calendar c1=Calendar.getInstance();
        //月份是0-11 可以把get(Calendar.MONTH))--->get(2) 因为Calendar.MONTH==2
        System.out.println(c1.get(Calendar.YEAR)+"年"+(c1.get(Calendar.MONTH))+"月"+(c1.get(Calendar.DAY_OF_MONTH)+
                "日")+(c1.get(Calendar.HOUR))+":"+(c1.get(Calendar.MINUTE))+":"+(c1.get(Calendar.SECOND)));
//        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        df.format(d)返回的是String类型
//        System.out.println(df.format(d));
        System.out.println(DateFormatUtils.getFormatDate(d));
    }
}
