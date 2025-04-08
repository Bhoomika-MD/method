package com.xworkz.internal.bindass;

public class Html extends Language{
    public void coding(Language language){
        language.easy();
        if(language instanceof Language){
            System.out.println("html is a language");
            Html html=(Html) language;
            html.web();
            language.practise();
            language.read();
            language.tough();
            language.write();
        }
    }
    public void web(){
        System.out.println("web in html");
    }
}
