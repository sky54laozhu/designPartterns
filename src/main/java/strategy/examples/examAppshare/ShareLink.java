package strategy.examples.examAppshare;

/**
 * 分享链接
 */
public interface ShareLink {

    String getShareLink(final String platform, final String userToken);

}
