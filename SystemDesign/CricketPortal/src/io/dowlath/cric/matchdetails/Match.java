package io.dowlath.cric.matchdetails;

import java.util.Date;
import java.util.List;

import io.dowlath.cric.enums.MatchResult;
import io.dowlath.cric.teamdetails.Playing11;
import io.dowlath.cric.users.Commentator;
import io.dowlath.cric.users.Referee;
import io.dowlath.cric.users.Umpire;

public abstract class Match {
	private int number;
	private Date startTime;
	private MatchResult result;
	private Playing11[] teams;
	private List<Inning> innings;
	private List<Umpire> umpires;
	private Referee referee;
	private List<Commentator> commentators;
	private List<MatchStat> matchStats;

	public boolean assignStadium(Stadium stadium) {}

	public boolean assignReferee(Referee referee) {}
}
