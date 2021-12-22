
public class Book {
	private String pagesno;
	private String title;
	public String getPagesno() {
		return pagesno;
	}
	public void setPagesno(String pagesno) {
		this.pagesno = pagesno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [pagesno=" + pagesno + ", title=" + title + "]";
	}

	

}
