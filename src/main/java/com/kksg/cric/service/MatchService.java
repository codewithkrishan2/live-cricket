package com.kksg.cric.service;

import java.util.List;
import java.util.Map;

import com.kksg.cric.entities.Match;

public interface MatchService {

	//Get All Matches
	List<Match> getAllMatches();
	
	//get Live Matches
	List<Match> getLiveMatchs();
	
	//get Point Table
	List<List<String>> getPointTable();
}