import java.io.Serializable;
import java.util.Objects;

public class Book implements Comparable<Book>, Serializable {
	private long isbn;
	private static final long serialVersionUID = -6790151306696690129L;
	private String title;
	private String authorName;
	private int noOfPages;

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return o.authorName.compareTo(this.authorName);
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public int hashCode() {
//		return Objects.hash(authorName, isbn, noOfPages, title);
		 final int prime = 31;
	        int result = 1;
	        result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
	        result = prime * result + (int) (isbn ^ (isbn >>> 32));
	        result = prime * result + noOfPages;
	        result = prime * result + ((title == null) ? 0 : title.hashCode());
	        return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && isbn == other.isbn && noOfPages == other.noOfPages
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", authorName=" + authorName + ", noOfPages=" + noOfPages
				+ "]";
	}
    
}
