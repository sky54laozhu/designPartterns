package strategy.examples.examAppshare;
/**
 * 项目中运用策略模式的场景很多，比如不同会员等级购买产品价格计算，比如对不同消费用户做内容营销的时候，都是可以使用策略模式来解决问题的
 */
public class WechatClient {
    public static void main(String[] args) throws Exception {
        ShareContext context = ShareContext
                .getShareTarget(1);
        System.out.println(context.showContent());
        System.out.println(context.showTitle());
        System.out.println(context.displayImageUrl("android"));
        System.out.println(context.displayShareLinkUrl("ios", "?#"));
    }
}
