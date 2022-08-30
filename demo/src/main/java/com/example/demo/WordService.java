package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WordService {

    @Autowired
    static
    MixedWordRepository repository;

    public Word getWordService() {
        return repository.getWord();
    }



}
