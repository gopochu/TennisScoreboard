package com.vadlap.TennisScoreboard.mapper;

import com.vadlap.TennisScoreboard.dto.MatchDto;
import com.vadlap.TennisScoreboard.model.Match;
import com.vadlap.TennisScoreboard.model.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MatchMapper {
    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "player1Id", source = "player1Id")
    @Mapping(target = "player2Id", source = "player2Id")
    @Mapping(target = "winnerId", source = "winnerId")
    MatchDto toDto(Match match);

    @Mapping(target = "player1Id", source = "player1Id")
    @Mapping(target = "player2Id", source = "player2Id")
    Match toEntity(MatchDto dto);
}
