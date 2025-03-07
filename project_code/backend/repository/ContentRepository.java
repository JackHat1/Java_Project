package backend.repository;

import backend.content.Content;

public class ContentRepository {
    private int MAX_CONTENT;
    private Content[] contentList;
    private int contentCount;

    public int getMAX_CONTENT() {
        return MAX_CONTENT;
    }
    // private void setMAX_CONTENT(int mAX_CONTENT) {
    //     MAX_CONTENT = mAX_CONTENT;
    // }
    protected Content[] getContentList() {
        return contentList;
    }
    // private void setContentList(Content[] contentList) {
    //     this.contentList = contentList;
    // }
    public int getContentCount() {
        return contentCount;
    }
    // private void setContentCount(int contentCount) {
    //     this.contentCount = contentCount;
    // }

    public ContentRepository(int maxNumOfContentEntries){
        this.MAX_CONTENT = maxNumOfContentEntries;
    }
}
