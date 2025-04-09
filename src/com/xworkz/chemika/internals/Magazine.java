package com.xworkz.chemika.internals;

public class Magazine {
   private String title;
   private int issueNumber;
   private String publisher;

    public Magazine(String title,int issueNumber,String publisher){
        this.title=title;
        this.issueNumber=issueNumber;
        this.publisher=publisher;
    }
    @Override
    public String toString(){
        return "title :"+title+"issueNumber :"+issueNumber+"publisher :"+publisher;
    }
}
