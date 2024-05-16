package Behavioral.Iterator.SocialMediaFeed;

// post class
public class Post {

    private String user;
    private String content;
    private String timestamp;

    public Post(String user, String content, String timestamp) {
        this.user = user;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "User: " + user + ", Content: " + content + ", Timestamp: " + timestamp;
    }
}
