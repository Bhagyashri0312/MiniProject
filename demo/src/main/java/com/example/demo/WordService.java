package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class WordService {

    MixedWordRepository repository;
    String secretWord;
    StringBuilder showWord;


    public WordService(){
        repository = new MixedWordRepository();
        secretWord = repository.getWord();
        showWord = new StringBuilder("*".repeat(secretWord.length()));
    }

    public StringBuilder makeGuess(char ch){

        for (int i = 0; i < secretWord.length(); i++) {
            if(secretWord.charAt(i)==ch){
                showWord.setCharAt(i,ch);
            }

            }

        return showWord;
    }
  /*  public void count() {
        int count =0;
        while (count < 7 && showWord.toString().contains("*")) {
        System.out.println("Guess any letter in the word");
        System.out.println(asterisk);*//**//*
        String makeGue= sc.next();
        hang(guess);
        }*/

    public boolean finished(){

        return showWord.toString().equals(secretWord);
    }

}
