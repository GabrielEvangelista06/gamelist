package com.apollodev.gamelist.repositories;

import com.apollodev.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
