package com.pb.drobchuk.hw5;

public class Book {
    String bookName;
    String authorName;
    int yearBook;

    String getInfo(){
        return "[Название книги: " + bookName + ", Автор книги: " + authorName + ", Год издания: "+yearBook+"г.]";
    }
}
