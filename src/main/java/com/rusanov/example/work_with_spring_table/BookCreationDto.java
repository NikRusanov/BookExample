package com.rusanov.example.work_with_spring_table;

import java.util.ArrayList;
import java.util.List;

public class BookCreationDto {

    private List<Book> books;

    public BookCreationDto() {
        this.books = new ArrayList<>();
    }

    public BookCreationDto(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
