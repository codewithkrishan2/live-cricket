package com.kksg.cric.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kksg.cric.entities.Match;


public interface MatchRepo extends JpaRepository<Match, Integer> {

	//finding match by teamHeading
	Optional<Match> findByTeamHeading(String teamHeading);
}
