package com.projectspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.dslist.entities.GameList;

public interface GameListRepositories extends JpaRepository<GameList, Long> {

}