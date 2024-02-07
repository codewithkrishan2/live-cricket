package com.kksg.cric.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kksg.cric.entities.Match;
import com.kksg.cric.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	private MatchService matchService;
	
	
	
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}



	//Get Live Matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatchs(){
		return new ResponseEntity<List<Match>>(this.matchService.getLiveMatchs(), HttpStatus.OK);
	}
	
	//Get All Matches
	@GetMapping("/all")
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<List<Match>>(this.matchService.getAllMatches(), HttpStatus.OK);
	}
	
	//Get Point Table
	@GetMapping("/point")
	public ResponseEntity<List<List<String>>> getPointTable(){
		return new ResponseEntity<List<List<String>>>(this.matchService.getPointTable(), HttpStatus.OK);
	}
	
}
