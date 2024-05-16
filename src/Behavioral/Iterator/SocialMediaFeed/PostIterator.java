package Behavioral.Iterator.SocialMediaFeed;

import java.util.List;
import java.util.NoSuchElementException;

public class PostIterator implements Iterator{

    private List<Post> posts;
    private int current;

    public PostIterator(List<Post> posts) {
        this.posts = posts;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < posts.size();
    }

    @Override
    public Post next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }

        return posts.get(current++);
    }
}
