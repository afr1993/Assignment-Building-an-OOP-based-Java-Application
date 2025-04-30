//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Adrian Flores Rangel
        Library library = new Library();

        // Add Books
        library.addBook(new Book("1984", "George Orwell", "ISBN001"));
        library.addBook(new Book("IT", "Stephen King", "ISBN002"));
        library.addBook(new Book("Cujo", "Stephen King", "ISBN003"));
        library.addBook(new Book("Misery", "Stephen King", "ISBN004"));
        library.addBook(new Book("The Shining", "Stephen King", "ISBN005"));

        library.addBook(new EBook("JavaScipt", "John Smith", "ISBN003", "PDF", 5.8));
        library.addBook(new EBook("Python Basics", "Jane Doe", "ISBN404", "EPUB", 4.5));
        library.addBook(new EBook("C Basics", "Mark H", "ISBN014", "EPUB", 3.2));
        library.addBook(new EBook("C++ Basics", "Mark H", "ISBN005", "EPUB", 3.0));
        library.addBook(new EBook("HTML/CSS", "Jane Doe", "ISBN091", "EPUB", 13.5));

        // Register Members
        Member adrian = new Member("Adrian", "M001");
        PremiumMember mike = new PremiumMember("Mike", "M002");

        library.registerMember(adrian);
        library.registerMember(mike);

        // Borrow Books
        library.borrowBook("M001", "ISBN001"); // adrian borrows Book by isbn
        library.borrowBook("M002", "ISBN003"); // Mike borrows Book by isbn
        library.borrowBook("M002", "ISBN004"); // Mike borrows Book by isbn

        // Display Available Books
        System.out.println();
        library.showAvailableBooks();

        // Display Members and their borrowed books
        System.out.println();
        library.showMembers();
    }
}

