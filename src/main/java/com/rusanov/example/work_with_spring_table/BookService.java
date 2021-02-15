package com.rusanov.example.work_with_spring_table;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    void saveAll(List<Book> books);
}
