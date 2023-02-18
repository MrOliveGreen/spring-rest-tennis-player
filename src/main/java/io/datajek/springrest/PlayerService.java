package io.datajek.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository repo;

    //Get all players
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    //Get player by ID
    public Player getPlayer(int id) {

        Optional<Player> tempPlayer = repo.findById(id);
        Player p = null;

        //if the Optional has a value, assign it to p
        if(tempPlayer.isPresent())
            p = tempPlayer.get();

        return p;
    }

    //Add a player

    //Update a player

    //Partial update

    //delete a player
}
