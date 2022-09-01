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
    words.add(new Word("Godfather"));
    words.add(new Word("Departed"));
    words.add(new Word("Gladiator"));
    words.add(new Word("Crocodile"));
    words.add(new Word("Transformers"));
    words.add(new Word("Rango"));
    words.add(new Word("Limitless"));
}
    public String getWord(){
        Random random = new Random();
        return String.valueOf(words.get(random.nextInt(words.size())));
    }

   /* public String printWordState(String word, char playerGuesses){
    for (int i = 0; i<word.length();i++){
            if (playerGuesses == (word.charAt(i))) {
                return "word.charAt(i)";
            }
            else {
                return "-";
            }
        }
        return null;
    }*/
    }


