package backend.repository;

public class ContentRepository {
    private int MAX_CONTENT;
    private Content[] contentList;
    private int contentCount;

    private int getMAX_CONTENT() {
        return MAX_CONTENT;
    }
    // private void setMAX_CONTENT(int mAX_CONTENT) {
    //     MAX_CONTENT = mAX_CONTENT;
    // }
    private Content[] getContentList() {
        return contentList;
    }
    // private void setContentList(Content[] contentList) {
    //     this.contentList = contentList;
    // }
    private int getContentCount() {
        return contentCount;
    }
    // private void setContentCount(int contentCount) {
    //     this.contentCount = contentCount;
    // }

}
