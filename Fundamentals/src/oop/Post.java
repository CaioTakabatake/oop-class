package oop;

public class Post implements PostRating {
    private String content;
    private int stars;

    public Post(String content) {
        this.content = content;
        this.stars = 0;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", stars=" + stars +
                '}';
    }

    @Override
    public void common() {
        this.stars += 1;
        System.out.println("Common post");
    }

    @Override
    public void nice() {
        this.stars += 3;
        System.out.println("Nice post");
    }

    @Override
    public void superNice() {
        this.stars += 5;
        System.out.println("Super nice post");
    }
}
