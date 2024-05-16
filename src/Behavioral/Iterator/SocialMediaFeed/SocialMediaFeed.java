package Behavioral.Iterator.SocialMediaFeed;

import java.util.ArrayList;
import java.util.List;

// aggregate class and creates interface
public class SocialMediaFeed{

    private List<Post> posts;

    public SocialMediaFeed() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post){
        posts.add(post);
    }

    public Iterator createIterator() {
        return new PostIterator(posts);
    }
}
