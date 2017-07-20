package ssm.util;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by white on 17/7/11.
 */

@Component
public class DateFormatter implements Formatter<Date> {

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        SimpleDateFormat sdf = null;
        Date d = null;

        String[] parts = text.split("[-/:\\s]+");
        if(parts.length == 6){
            sdf = new SimpleDateFormat("yyyy MM dd HH mm ss");
        }else if(parts.length == 3){
            sdf = new SimpleDateFormat("yyyy MM dd");
        }
        String tr = String.join(" ", parts);
        try {
            d = sdf.parse(tr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

    @Override
    public String print(Date object, Locale locale) {
        Date d = (Date) object;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(d);
        return date;
    }
}


