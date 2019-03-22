package strategy.theory;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void  algorithmInterface() {
        //相关的业务
        System.out.println("This is algorithm A ;");
    }

}