package io.datajek.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository repo;

    //Get all players
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    //Get player by ID

    //Add a player

    //Update a player

    //Partial update

    //delete a player
}
