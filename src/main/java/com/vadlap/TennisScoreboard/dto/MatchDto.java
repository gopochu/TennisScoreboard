package com.vadlap.TennisScoreboard.dto;

import java.util.UUID;

public record MatchDto (
    UUID uuid,
    Long player1Id,
    Long player2Id,
    Long winnerId
) {}

