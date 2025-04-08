package com.xworkz.internal.bindass;

public class Mahabharatha extends Book{
    public void seen(Book book){
        book.buy();
        if(book instanceof Book){
            System.out.println("mahabharatha is a book");
            Mahabharatha mahabharatha=(Mahabharatha) book;
            mahabharatha.chapter();
            book.give();
            book.read();
            book.take();
            book.write();
        }
    }
    public void chapter(){
        System.out.println("mahabharatha chapter");
    }
}
