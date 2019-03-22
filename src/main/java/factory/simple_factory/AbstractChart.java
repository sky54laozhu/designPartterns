package factory.simple_factory;

import com.sun.tools.javac.code.Attribute;

import java.util.Optional;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 16:49
 * @description：画图抽象工厂类
 */
public abstract class AbstractChart {
    public static AbstractChart getChart(String type) throws UnSupportedShapeException {
        Optional oType = Optional.ofNullable(type);
        if (!"null".equals(oType.get())) {
            try {
                return (AbstractChart)Class.forName(PropertyUtil.getValue(XMLUtil.getChartType())).newInstance() ;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new UnSupportedShapeException();
        }
        return null;
    }
    abstract void draw ();
    abstract void erase ();
}