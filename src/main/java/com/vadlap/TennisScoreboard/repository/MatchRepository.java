package com.vadlap.TennisScoreboard.repository;

import com.vadlap.TennisScoreboard.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MatchRepository extends JpaRepository<Match, UUID> {

}
