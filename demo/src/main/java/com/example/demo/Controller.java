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
   public String getMovieWords(HttpSession session, Model model){
       WordService wordService = new WordService();
       session.setAttribute("wordService", wordService);
       model.addAttribute("word", wordService.getShowWord());
       return "game";
   }

    @PostMapping("/mixedWord")
    public String getMixedWords(Model model, @RequestParam String c, HttpSession session){
       char guess = c.isEmpty() ? ' ' : c.charAt(0);
       WordService wordService = (WordService) session.getAttribute("wordService");
       if(wordService == null){
           wordService = new WordService();
       }
       //session.setAttribute("getWord", service.repository.getWord());
       StringBuilder mixedWord = (wordService.makeGuess(guess));
       if(wordService.finished()){
           session.setAttribute("wordService",new WordService());
           model.addAttribute("word", mixedWord);
           return "gameWon";

       } else if (wordService.failed()) {
           session.setAttribute("wordService",new WordService());
           return "gamelost";

       } else {
           model.addAttribute("word", mixedWord);
           model.addAttribute("guessCount", wordService.getGuessCount());
           session.setAttribute("wordService", wordService);
       }
           return "game";

    }

}
