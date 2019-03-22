package strategy.examples.examAppshare;

/**
 * 微信分享内容
 */
public class WechatContent implements ShareContent {

    @Override
    public String showContent() {
        return BundleUtil.getResult("share.wechat.content");
    }
}