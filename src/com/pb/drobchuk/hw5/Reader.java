package com.pb.drobchuk.hw5;

public class Reader {

    String FIO;
    int biletNumber;
    String faculty;
    String dateBirthday;
    String phoneNumber;

    String getInfo(){
        return "[ФИО: " + FIO + ", Номер читательского билета: " + biletNumber +
                ", Факультет: "+faculty+", Дата рождения: "+dateBirthday+
                ", Телефон №: "+phoneNumber+"]";
    }

    void takeBook (String FIO){
        System.out.println("["+FIO+" взял 3 книги ]");
    }
    void takeBook(String FIO, String bookName1, String bookName2, String bookName3){
        System.out.println("["+FIO+" взял книги: "+ bookName1+", "+ bookName2+", "+ bookName3 +"]");
    }
    void takeBook(String FIO, String bookName1, String authorName1, int yearBook1,
                              String bookName2, String authorName2, int yearBook2,
                              String bookName3, String authorName3, int yearBook3){
        System.out.println("["+FIO+" взял книги: "+ bookName1+"("+authorName1+yearBook1+"г.), "
                                                  + bookName2+"("+authorName2+yearBook2+"г.), "
                                                  + bookName3+"("+authorName3+yearBook3+"г.)]");
    }
    void returnBook(String FIO){
        System.out.println("["+FIO+" вернул 3 книги ]");
    }
    void returnBook(String FIO, String bookName1, String bookName2, String bookName3){
        System.out.println("["+FIO+" вернул книги: "+ bookName1+", "+ bookName2+", "+ bookName3 +"]");
    }
    void returnBook(String FIO, String bookName1, String authorName1, int yearBook1,
                  String bookName2, String authorName2, int yearBook2,
                  String bookName3, String authorName3, int yearBook3){
        System.out.println("["+FIO+" вернул книги: "+ bookName1+"("+authorName1+yearBook1+"г.), "
                + bookName2+"("+authorName2+yearBook2+"г.), "
                + bookName3+"("+authorName3+yearBook3+"г.)]");
    }
}


