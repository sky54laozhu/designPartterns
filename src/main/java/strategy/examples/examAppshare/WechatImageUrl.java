package strategy.examples.examAppshare;

/**
 * 微信缩略图
 */
public class WechatImageUrl implements ShareImageUrl {

    @Override
    public String showImageUrl(final String platform) {
        return BundleUtil.getResult("share.wechat.image.url." + platform);
    }
}