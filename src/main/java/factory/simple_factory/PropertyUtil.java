package factory.simple_factory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 18:00
 * @description：属性文件读写工具类
 */
public class PropertyUtil {
    public static String getValue(String key){
        Properties protis = new Properties();
        try {
            protis.load(ClassLoader.getSystemResourceAsStream("simple_factory_config.properties"));
            return protis.getProperty(key,"null");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
