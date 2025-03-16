// Superclass: Book
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

// Subclass: Author (Extends Book)
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object (which is also a Book)
        Author author1 = new Author("The Art of Discipline", 2023, "Madhav Aggarwal", "Self-improvement enthusiast and Java developer.");

        // Display details of the book and its author
        author1.displayInfo();
    }
}
