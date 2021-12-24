package com.springgradle;

import java.util.Objects;

public class Book {
	private String Author;
	private int Id;
	private String Title;

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Author, Id, Title);
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
		return Objects.equals(Author, other.Author) && Id == other.Id && Objects.equals(Title, other.Title);
	}

	@Override
	public String toString() {
		return "Book [Author=" + Author + ", Id=" + Id + ", Title=" + Title + "]";
	}

}
