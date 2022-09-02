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
    words.add(new Word("avatar"));
    words.add(new Word("inception"));
    words.add(new Word("parasite"));
    words.add(new Word("joker"));
    words.add(new Word("coco"));
    words.add(new Word("titanic"));
    words.add(new Word("beast"));
    words.add(new Word("gladiator"));
    words.add(new Word("rocky"));
    words.add(new Word("transformers"));
    words.add(new Word("rango"));
    words.add(new Word("limitless"));
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


