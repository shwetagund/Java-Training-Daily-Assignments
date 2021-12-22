
public class TestBook {
	String title, author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static void main(String[] args) {
		TestBook b1 = new TestBook();
		System.out.println(b1.hashCode());      // Hash Code
		b1.setTitle("The Java Programming: Second Edition");
		b1.setAuthor("Ken Arnold and James Gosling");
		System.out.println("Title: " + b1.getTitle());
		System.out.println("Author:" + b1.getAuthor());
	}
}
