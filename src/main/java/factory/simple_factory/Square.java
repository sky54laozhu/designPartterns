package factory.simple_factory;

/**
 * @author ：zhuweifeng
 * @date ：Created in 2019-03-22 17:09
 * @description：方
 */
public class Square extends AbstractChart{
    @Override
    void draw() {
        System.out.println("Square draw.");
    }

    @Override
    void erase() {
        System.out.println("Square erase.");
    }
}
