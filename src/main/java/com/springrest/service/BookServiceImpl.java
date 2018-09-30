package com.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springrest.dao.BookDAO;
import com.springrest.model.Book;

@Service
@Transactional(readOnly=true)
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDao;
	@Transactional
	@Override
	public long save(Book book) {
		return bookDao.save(book);
	}

	@Override
	public Book get(long id) {
		return bookDao.get(id);
	}

	@Override
	public List<Book> list() {		
		return bookDao.list();
	}
	
	@Transactional
	@Override
	public void update(long id, Book book) {
		bookDao.update(id, book);
	}

	@Transactional
	@Override
	public void delete(long id) {
		bookDao.delete(id);
	}
}
