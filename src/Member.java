// Member.java
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        setName(name);
        setMemberId(memberId);
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
    }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) {
        if (memberId != null && !memberId.isEmpty()) this.memberId = memberId;
    }

    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public int getMaxBooks() {
        return 3;
    }

    public boolean borrowBook(Book book) {
        if (book.isAvailable() && borrowedBooks.size() < getMaxBooks()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Member: ").append(name).append(" (ID: ").append(memberId).append(")\nBorrowed Books:\n");
        if (borrowedBooks.isEmpty()) {
            sb.append("  None\n");
        } else {
            for (Book b : borrowedBooks) {
                sb.append("  - ").append(b.getDetails()).append("\n");
            }
        }
        return sb.toString();
    }
}
