package com.projectspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.dslist.entities.Game;

public interface GameRepositories extends JpaRepository<Game, Long> {

}