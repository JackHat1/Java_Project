package backend.repository;

import backend.content.Content;

public class ContentRepository {
    private int MAX_CONTENT ;
    private Content[] contentList;
    private int contentCount;

    //CONSTRUCTOR // 
    public ContentRepository(int maxNumOfContentEntries){
        this.MAX_CONTENT = maxNumOfContentEntries;
        this.contentList = new Content[MAX_CONTENT]; 
        this.contentCount = 0; 
    }

    //GETTERS &SETTERS //
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

    // METHODS // 
    public boolean addContent(Content content) {
        if (contentCount >= MAX_CONTENT) {
            System.out.println("WARNING: Cannot add content. Storage is full.");
            return false; 
        }
        // Check for duplicate title
        for (int i = 0; i < contentCount; i++) {
            if (contentList[i] != null && contentList[i].getTitle().equalsIgnoreCase(content.getTitle())) {
                System.out.println("WARNING: Duplicate title detected. Content not added.");
                return false;
            }
        }
        contentList[contentCount] = content;
        contentCount++;
        return true;
    }
    
    public Content findContentById(int contentId) {
        for (int i = 0; i < contentCount; i++) {
            if (contentList[i] != null && contentList[i].getContentId() == contentId) { 
                return contentList[i]; 
            }
        }
        return null; 
    }

    public Content findContentByTitle(String name) {
        for (int i = 0; i < contentCount; i++) { 
            if (contentList[i] != null && contentList[i].getTitle().equals(name)) { // to compare strings we must to use equals                                                                   
                return contentList[i];                                              // If two strings match each other, it returns true otherwise, it returns false.
            }
        }
        return null; 
    }
    
    public Content[] getAllContent() {
        return contentList; 
    }
    
    
}
