package com.BikkadIT.SpringMvcFirstApp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMvcFirstApp.model.Book;

@Controller
public class BookController {

	@GetMapping("/booksData")
	public ModelAndView getBookData() {
		
		Book book =new Book();
		book.setBookId(111);
		book.setBookName("java");
		book.setBookPrice(655.00);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("BOOKS", book);
		mav.setViewName("book");
		return mav;
		
	}

	@GetMapping("/GetAllBookData")
public ModelAndView getAllBookData() {
		
		Book book =new Book();
		book.setBookId(111);
		book.setBookName("java");
		book.setBookPrice(655.00);
		
		Book book1 =new Book();
		book1.setBookId(111);
		book1.setBookName("java");
		book1.setBookPrice(655.00);
		
		Book book2 =new Book();
		book2.setBookId(111);
		book2.setBookName("java");
		book2.setBookPrice(655.00);
		
		List<Book> books=new ArrayList<>();
		books.add(book);
		books.add(book1);
		books.add(book2);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("AllBOOKS", books);
		mav.setViewName("books");
		return mav;
		
	}
}
