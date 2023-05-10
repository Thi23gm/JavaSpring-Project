package com.projectspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectspring.dslist.dto.GameMinDTO;
import com.projectspring.dslist.entities.Game;
import com.projectspring.dslist.repositories.GameRepositories;

@Service
public class GameService {

    @Autowired
    private GameRepositories gameRepositories;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositories.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
