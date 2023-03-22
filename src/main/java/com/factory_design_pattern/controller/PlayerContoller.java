package com.factory_design_pattern.controller;


import com.factory_design_pattern.chain.RuleManagerCommand;
import com.factory_design_pattern.model.Player;
import com.factory_design_pattern.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerContoller {

    @Autowired
    RuleManagerCommand ruleManagerCommand;
    @Autowired
    PlayerRepository playerRepository;

    @PostMapping("/addPlayer")
    public Player processPlayersData(@RequestBody Player requestBody)
    {
           Player player=new Player();
           ruleManagerCommand.processData(requestBody);
          return playerRepository.save(requestBody);
         //  return "update in ";
    }
}
