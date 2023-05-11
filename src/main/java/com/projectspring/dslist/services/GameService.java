package com.projectspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectspring.dslist.dto.GameDTO;
import com.projectspring.dslist.dto.GameMinDTO;
import com.projectspring.dslist.entities.Game;
import com.projectspring.dslist.projections.GameMinProjection;
import com.projectspring.dslist.repositories.GameRepositories;

@Service
public class GameService {

    @Autowired
    private GameRepositories gameRepositories;

    @Transactional(readOnly = true)
    public GameDTO findById(long id) {
        Game result = gameRepositories.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositories.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(long listId) {
        List<GameMinProjection> result = gameRepositories.searchByList(listId);
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
