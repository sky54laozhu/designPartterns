package strategy.theory;

/**
 * 项目中运用策略模式的场景很多，比如不同会员等级购买产品价格计算，比如对不同消费用户做内容营销的时候，都是可以使用策略模式来解决问题的
 */
public class StrategyClient {
    public static void main(String[] args){
        //选择使用的策略
        Strategy s = new ConcreteStrategyA();
        Context context = new Context(s);
        context.contextInterface();
        Strategy sB = new ConcreteStrategyB();
        Context contextB = new Context(sB);
        contextB.contextInterface();
        Strategy sC = new ConcreteStrategyC();
        Context contextC = new Context(sC);
        contextC.contextInterface();
    }
}
