
public class Books {
	private String bookID;
	private String bookName;

	public String getBookID() {
		return bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + "]";
	}
	
}
