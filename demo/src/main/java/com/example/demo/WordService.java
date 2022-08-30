package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {

    @Autowired
    MixedWordRepository repository;
    public char getWordState() {
        return repository.printWordState(repository.getWord(),'a');
    }
}
