package com.kksg.cric.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cricket_matches")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer matchId;

	private String teamHeading;

	private String matchNumberVenue;

	private String battingTeam;

	private String battingTeamScore;

	private String bowlTeam;

	private String bowlTeamScore;

	private String liveText;

	private String matchLink;

	private String textComplete;

	@Enumerated
	private MatchStatus status;

	private Date date = new Date();

	
	
	// Set the match status according to the textComplete
	public void setMatchStatus() {

		this.status = textComplete.isBlank() ? MatchStatus.LIVE : MatchStatus.COMPLETED;

	}
}
