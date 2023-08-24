package activityClasses;

public class Course {
    private String name;
    private String description;
    private Category category;

    public Course(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                '}';
    }

    public static void main(String[] args) {
        Course course1 = new Course("Programming Basics", "Learn the fundamentals of programming", Category.PROGRAMMING);
        Course course2 = new Course("Graphic Design Fundamentals", "Explore the basics of graphic design", Category.DESIGN);
        Course course3 = new Course("Digital Marketing Essentials", "Master the essentials of digital marketing", Category.MARKETING);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
