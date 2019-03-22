package factory.simple_factory;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 17:07
 * @description：圆
 */
public class Circle extends AbstractChart{

    @Override
    void draw() {
        System.out.println("Circle draw.");
    }

    @Override
    void erase() {
        System.out.println("Circle erase.");
    }
}
