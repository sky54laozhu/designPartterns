package strategy.examples.examAppshare;

public class ShareContext {

    protected ShareTitle shareTitle;

    protected ShareContent shareContent;

    protected ShareImageUrl shareImageUrl;

    protected ShareLink shareLink;

    public static ShareContext getShareTarget(Integer type) {
        String className = BundleUtil.getResult(type.toString());
        Class cls;
        try {
            cls = Class.forName(className);
            return (ShareContext) cls.newInstance();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public final String showTitle() {
        return shareTitle.showTitle();
    }

    public final String showContent() {
        return shareContent.showContent();
    }

    public final String displayImageUrl(final String platform) {
        return shareImageUrl.showImageUrl(platform);
    }

    public final String displayShareLinkUrl(final String platform, final String  userToken) {
        return shareLink.getShareLink(platform, userToken);
    }

    public static ShareInfo getShareInfo(ShareContext context, String platform, String userToken) {
        ShareInfo info = new ShareInfo();
        info.setContent(context.showContent());
        info.setImageUrl(context.displayImageUrl(platform));
        info.setTitle(context.showTitle());
        info.setShareLink(context.displayShareLinkUrl(platform, userToken));
        return info;
    }
}