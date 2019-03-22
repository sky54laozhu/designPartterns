package factory.simple_factory;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 17:13
 * @description：三角形
 */
public class Triangle extends AbstractChart{
    @Override
    void draw() {
        System.out.println("Triangle draw.");
    }

    @Override
    void erase() {
        System.out.println("Triangle erase.");
    }
}
