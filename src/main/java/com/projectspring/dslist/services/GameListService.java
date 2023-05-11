package com.projectspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectspring.dslist.dto.GameListDTO;
import com.projectspring.dslist.entities.GameList;
import com.projectspring.dslist.repositories.GameListRepositories;

@Service
public class GameListService {

    @Autowired
    private GameListRepositories gameListRepositories;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepositories.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
