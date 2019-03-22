package factory.simple_factory;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 17:41
 * @description：梯形
 */
public class Trapezoid extends AbstractChart{

    @Override
    void draw() {
        System.out.println("Trapezoid draw.");
    }

    @Override
    void erase() {
        System.out.println("Trapezoid erase.");
    }
}
