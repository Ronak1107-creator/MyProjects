
import java.util.*;

class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Issued: " + isIssued);
    }
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Member extends Person {
    private List<Book> borrowedBooks;

    public Member(String name, int id) {
        super(name, id);
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (!book.isIssued()) {
            book.issue();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Borrowed Books:");
        for (Book b : borrowedBooks) {
            System.out.println(" - " + b.getTitle());
        }
    }
}

class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added.");
    }

    public void addMember(String name, int id) {
        members.add(new Member(name, id));
        System.out.println("Member added.");
    }

    public void showAllBooks() {
        for (Book book : books) {
            book.display();
        }
    }

    public Member getMemberById(int id) {
        for (Member m : members) {
            if (m.id == id) {
                return m;
            }
        }
        return null;
    }

    public Book getBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}

public class LibraryManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Books");
            System.out.println("6. View Member Info");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    System.out.print("Member Name: ");
                    String name = sc.nextLine();
                    System.out.print("Member ID: ");
                    int id = sc.nextInt();
                    library.addMember(name, id);
                    break;
                case 3:
                    System.out.print("Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    Member mem = library.getMemberById(mid);
                    if (mem != null) {
                        System.out.print("Book Title to Issue: ");
                        String btitle = sc.nextLine();
                        Book book = library.getBookByTitle(btitle);
                        if (book != null) {
                            mem.borrowBook(book);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;
                case 4:
                    System.out.print("Member ID: ");
                    int rid = sc.nextInt();
                    sc.nextLine();
                    Member rmem = library.getMemberById(rid);
                    if (rmem != null) {
                        System.out.print("Book Title to Return: ");
                        String btitle = sc.nextLine();
                        Book book = library.getBookByTitle(btitle);
                        if (book != null) {
                            rmem.returnBook(book);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;
                case 5:
                    library.showAllBooks();
                    break;
                case 6:
                    System.out.print("Member ID: ");
                    int infoId = sc.nextInt();
                    Member m = library.getMemberById(infoId);
                    if (m != null) {
                        m.displayInfo();
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}