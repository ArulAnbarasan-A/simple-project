package com;

import com.model.Author;
import com.model.Book;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
        book.setTitle("Subconscious of Mind");
        Author author = new Author();
        author.setName("Joseph Murphy");
        book.setAuthor(author);
        System.out.println(book);
	}
}
