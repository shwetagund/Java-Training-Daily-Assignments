package com.springgradle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo1 {
	@GetMapping("/Greet")
//	public String Greet() {
//		return "index1";
//	}
	
	public String sendMessage(Model m) {
		m.addAttribute("myobj", "shweta gund");
		List<Book> books = new ArrayList<>();
		Book b1= new Book();
		b1.setAuthor("Gund");
		b1.setId(7);
		b1.setTitle("mobile dvelopment");
		
		Book b2 = new Book();
		b2.setAuthor("Gund");
		b2.setId(7);
		b2.setTitle("mobile dvelopment");
		books.add(b1);
		books.add(b2);
		m.addAttribute("mybooks", "books");
		 return "index1";
	}
}