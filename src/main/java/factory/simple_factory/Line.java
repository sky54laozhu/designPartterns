package factory.simple_factory;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 18:12
 * @description：线
 */
public class Line extends AbstractChart{
    @Override
    void draw() {
        System.out.println("line draw.");
    }

    @Override
    void erase() {
        System.out.println("line erase.");
    }
}
