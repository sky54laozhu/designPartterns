package strategy.examples.examAppshare;

/**
 * 微信标题
 */
public class WechatTitle implements ShareTitle {

    @Override
    public String showTitle() {
        return BundleUtil.getResult("share.wechat.title");
    }
}