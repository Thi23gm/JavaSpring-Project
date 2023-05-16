package com.projectspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectspring.dslist.dto.GameListDTO;
import com.projectspring.dslist.entities.GameList;
import com.projectspring.dslist.projections.GameMinProjection;
import com.projectspring.dslist.repositories.GameListRepositories;
import com.projectspring.dslist.repositories.GameRepositories;

@Service
public class GameListService {

    @Autowired
    private GameListRepositories gameListRepositories;

    @Autowired
    private GameRepositories gameRepositories;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepositories.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepositories.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        System.out.println(min + " --- " + max);
        for (int i = min; i <= max; i++) {
            gameListRepositories.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
