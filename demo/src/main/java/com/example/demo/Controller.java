package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private WordService service;


   @GetMapping("/movie")
   public String getMovieWords(){
       return "game";
   }

    @PostMapping("/movie")
    public String getMixedWords(Model model){
         char mixedWord = service.getWordState();
         model.addAttribute("word", mixedWord);
        return "game";
    }



}
