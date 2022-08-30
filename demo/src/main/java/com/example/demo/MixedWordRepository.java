package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class MixedWordRepository {
private List<Word> words;

public MixedWordRepository(){
    words = new ArrayList<>();
    words.add(new Word("Avatar"));
    words.add(new Word("Inception"));
    words.add(new Word("Parasite"));
    words.add(new Word("Joker"));
    words.add(new Word("Coco"));
    words.add(new Word("The Godfather"));
    words.add(new Word("The Departed"));
    words.add(new Word("Gladiator"));
    words.add(new Word("Big Fish"));
    words.add(new Word("Transformers"));
    words.add(new Word("Rango"));
    words.add(new Word("Limitless"));
}
    public String getWord(){
        Random random = new Random();
        String word = String.valueOf(words.get(random.nextInt(words.size())));
        return word;
    }

    }


