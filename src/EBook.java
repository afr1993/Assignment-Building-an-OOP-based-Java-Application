
public class EBook extends Book {
    private String fileFormat;
    private double fileSize;

    public EBook(String title, String author, String isbn, String fileFormat, double fileSize) {
        super(title, author, isbn);
        setFileFormat(fileFormat);
        setFileSize(fileSize);
    }

    public String getFileFormat() { return fileFormat; }
    public void setFileFormat(String fileFormat) {
        if (fileFormat != null && !fileFormat.isEmpty()) this.fileFormat = fileFormat;
    }

    public double getFileSize() { return fileSize; }
    public void setFileSize(double fileSize) {
        if (fileSize > 0) this.fileSize = fileSize;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " [EBook - Format: " + fileFormat + ", Size: " + fileSize + "MB]";
    }
}
