import java.util.Set;

public class Authors {
	private String authorID;
    private String authorName;
    private Set<Books> books;
    public String getAuthorID() {
        return authorID;
    }
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Set<Books> getBooks() {
		return books;
	}
	public void setBooks(Set<Books> books) {
		this.books = books;
	}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}
    
}
