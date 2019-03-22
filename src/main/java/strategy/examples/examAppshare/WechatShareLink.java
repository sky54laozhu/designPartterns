package strategy.examples.examAppshare;

/**
 * 微信分享链接
 */
public class WechatShareLink implements ShareLink {

    @Override
    public String getShareLink(final String platform, final String userToken) {
        return BundleUtil.getResult("share.wechat.link." + platform) + userToken;
    }
}