package backend.service;

import backend.repository.ContentRepository;

public class NetflixService {
    private ContentRepository contentRepo;

    public ContentRepository getContentRepo() {
        return contentRepo;
    }

    // public void setContentRepo(ContentRepository contentRepo) {
    //     this.contentRepo = contentRepo;
    // }

    public NetflixService(ContentRepository contentRepo){
        this.contentRepo = contentRepo;
    }
}
