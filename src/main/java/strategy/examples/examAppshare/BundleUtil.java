package strategy.examples.examAppshare;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class BundleUtil {
    public static String getResult(String key){
        Properties pro = new Properties();
        try {
            pro.load(ClassLoader.getSystemResourceAsStream("share-app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = pro.getProperty(key);
        try {
            result=new String(result.getBytes("ISO-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
