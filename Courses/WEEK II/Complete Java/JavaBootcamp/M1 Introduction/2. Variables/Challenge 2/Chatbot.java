//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Hello. What is your name?");
        String name = s.nextLine();

                           
        //add new a line before asking next question. 
        System.out.println("Hi"+ name +" I'm Javabot. Where are you from?");
        String local = s.nextLine();
                        

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at "+ local +"! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int old = s.nextInt();
        //Pick up age and store it.


        //add new a line before asking next question.
        System.out.println("\nSo you're " + old + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + 400/old + "times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        s.nextLine();
        String language = s.nextLine(); 


        //add new a line here.
        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name +". I have to log off now. See ya!");
        
        s.close();
        
    }
}
