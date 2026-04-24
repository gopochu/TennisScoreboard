package com.vadlap.TennisScoreboard.repository;

import com.vadlap.TennisScoreboard.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
