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
        showWord = new StringBuilder("_".repeat(secretWord.length()));
    }

    public StringBuilder makeGuess(char ch){

        for (int i = 0; i < secretWord.length(); i++) {
            if(secretWord.charAt(i)==ch){
                showWord.setCharAt(i,ch);
            }
        }
        return showWord;
    }

    public boolean finished(){
        return showWord.equals(secretWord);
    }
   /* public String getWordState() {
        return repository.printWordState(repository.getWord(),'a');
    }*/
}
