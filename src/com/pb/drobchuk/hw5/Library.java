package com.pb.drobchuk.hw5;

public class Library {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.bookName = "Приключения";
        book1.authorName = "Иванов И. И.";
        book1.yearBook = 2000;

        book2.bookName = "Словарь";
        book2.authorName = "Сидоров А. В. ";
        book2.yearBook = 1980;

        book3.bookName = "Энциклопедия";
        book3.authorName = "Гусев К. В. ";
        book3.yearBook = 2010;

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.FIO = "Петров В. В.";
        reader1.biletNumber = 1234;
        reader1.faculty = "Гриффиндор";
        reader1.dateBirthday = "01.01.2001";
        reader1.phoneNumber =  "+380355453311";

        reader2.FIO = "Соколов Б. В.";
        reader2.biletNumber = 1001;
        reader2.faculty = "Пуффендуй";
        reader2.dateBirthday = "11.01.1999";
        reader2.phoneNumber =  "+380958322144";

        reader3.FIO = "Рябов Г. Д.";
        reader3.biletNumber = 7777;
        reader3.faculty = "Слизерин";
        reader3.dateBirthday = "33.02.1800";
        reader3.phoneNumber =  "+380779655477";



        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());

        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());

        reader1.takeBook (reader1.FIO);
        reader1.takeBook (reader1.FIO, book1.bookName, book2.bookName, book3.bookName);
        reader1.takeBook (reader1.FIO, book1.bookName, book1.authorName,book1.yearBook,
                                       book2.bookName, book2.authorName,book2.yearBook,
                                       book3.bookName, book3.authorName,book3.yearBook);

        reader1.returnBook (reader1.FIO);
        reader1.returnBook (reader1.FIO, book1.bookName, book2.bookName, book3.bookName);
        reader1.returnBook (reader1.FIO, book1.bookName, book1.authorName,book1.yearBook,
                book2.bookName, book2.authorName,book2.yearBook,
                book3.bookName, book3.authorName,book3.yearBook);

    }
}
