package strategy.examples.examAppshare;

/**
 * 微信分享
 */
public class WechatShare extends ShareContext {

    public WechatShare() {
        super.shareTitle = new WechatTitle();
        super.shareContent = new WechatContent();
        super.shareImageUrl = new WechatImageUrl();
        super.shareLink = new WechatShareLink();
    }

}