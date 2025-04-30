// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public boolean borrowBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null) {
            return member.borrowBook(book);
        }
        return false;
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println("  - " + b.getDetails());
            }
        }
    }

    public void showMembers() {
        System.out.println("Registered Members:");
        for (Member m : members) {
            System.out.println(m.getDetails());
        }
    }

    private Member findMemberById(String memberId) {
        for (Member m : members) {
            if (m.getMemberId().equals(memberId)) return m;
        }
        return null;
    }

    private Book findBookByIsbn(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) return b;
        }
        return null;
    }
}
