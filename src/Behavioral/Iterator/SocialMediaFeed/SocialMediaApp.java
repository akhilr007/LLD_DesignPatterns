package Behavioral.Iterator.SocialMediaFeed;

public class SocialMediaApp {

    public static void main(String[] args) {

        Post post1 = new Post("Alice", "Enjoying the sunny weather!", "2024-05-16 10:00");
        Post post2 = new Post("Bob", "Had a great workout session.", "2024-05-16 11:00");
        Post post3 = new Post("Charlie", "Just finished reading a book.", "2024-05-16 12:00");
        Post post4 = new Post("Dave", "Working on a new project.", "2024-05-16 13:00");

        SocialMediaFeed socialMediaFeed = new SocialMediaFeed();
        socialMediaFeed.addPost(post1);
        socialMediaFeed.addPost(post2);
        socialMediaFeed.addPost(post3);
        socialMediaFeed.addPost(post4);

        Iterator iterator = socialMediaFeed.createIterator();

        while (iterator.hasNext()){
            Post post = iterator.next();
            System.out.println(post);
        }
    }
}
