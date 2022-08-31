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



   @GetMapping("/mixedWord")
   public String getMovieWords(){
       return "game";
   }

    @PostMapping("/mixedWord")
    public String getMixedWords(Model model, @RequestParam char c, HttpSession session){
       WordService wordService = (WordService) session.getAttribute("wordService");
       if(wordService == null){
           wordService = new WordService();
       }
       //session.setAttribute("getWord", service.repository.getWord());
       StringBuilder mixedWord = (wordService.makeGuess(c));
       if(wordService.finished()){
           session.setAttribute("wordService",new WordService());
           return "gameWon";
       }
       else {
           model.addAttribute("word", mixedWord);
           session.setAttribute("wordService", wordService);
       }
           return "game";

    }

}
