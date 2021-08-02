package com.nickdemos.java.annonclass;

public class Driver {

    public static void main (String [] args){
      Conversation conversation = new Conversation(){
          @Override
          public void greeting(){
              System.out.println("bibbity");
          }
      };

      conversation.greeting();

    }
}
