package vttp2022.paf.day11.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp2022.paf.day11.Repository.GameRepository;
import vttp2022.paf.day11.models.Comment;
import vttp2022.paf.day11.models.Game;

@Controller
@RequestMapping(path="/game")
public class getGameDetails {
    @Autowired
    private GameRepository gameRepo;

    @GetMapping(path="/{gid}")
    public String getGame(@PathVariable Integer gid,
    Model model){

        Optional<Game> opt = gameRepo.getGameByGid(gid);

        if(opt.isEmpty())
            return "error";
        
        Game game = opt.get();
        
        model.addAttribute("name", game.getName());
        model.addAttribute("year", game.getYear());
        model.addAttribute("ranking", game.getRanking());
        model.addAttribute("usersRated", game.getRanking());
        model.addAttribute("url", game.getUrl());
        model.addAttribute("image", game.getImage());

        List<Comment> ltc = gameRepo.getCommentsByGid(10);

        if(ltc.isEmpty())
            model.addAttribute("comments", "No Comments");

        model.addAttribute("comments", ltc);
        
        return "game";
    }
}
