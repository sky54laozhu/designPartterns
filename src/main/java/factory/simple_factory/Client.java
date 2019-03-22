package factory.simple_factory;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 17:15
 * @description：测试客户端
 */
public class Client {
    public static void main(String[] args) {
        AbstractChart ac;
        try {
            ac = AbstractChart.getChart(XMLUtil.getChartType());
            ac.draw();
            ac.erase();
//            ac = AbstractChart.getChart("square");
//            ac.draw();
//            ac.erase();
//            ac = AbstractChart.getChart("triangle");
//            ac.draw();
//            ac.erase();
        } catch (UnSupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
