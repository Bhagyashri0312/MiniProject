package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {

    private String secretWord;
    private StringBuilder showWord;

    public WordService() {
        secretWord = repository.getWord();
        showWord=new StringBuilder("_".repeat(secretWord.length()));
    }

    @Autowired
    MixedWordRepository repository;

    public boolean makeGuess(char ch){
        for (int i = 0; i < secretWord.length(); i++) {
            if(secretWord.charAt(i)==ch){
                showWord.setCharAt(i,ch);
            }

        }
        return secretWord.equals(showWord.toString());
    }
}
