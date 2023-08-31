package oop;

import java.util.ArrayList;

public class SocialNetwork {
    public static void main(String[] args) {
        Post firstPost = new Post("post test");
        Post secondPost = new Post("post test");
        Post thirdPost = new Post("post test");

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(firstPost);
        posts.add(secondPost);
        posts.add(thirdPost);

        starPosts(posts);

        System.out.println(posts);
    }

    private static void starPosts(ArrayList<Post> posts) {
        posts.forEach(post -> {
            for (int i = 0; i < 100; i++) {
                int randomNumber = (int) (Math.random() * 3);
                switch (randomNumber) {
                    case 0:
                        break;
                    case 1: {
                        post.common();
                        break;
                    }
                    case 2: {
                        post.nice();
                        break;
                    }
                    case 3: {
                        post.superNice();
                        break;
                    }
                }
            }
        });
    }
}
