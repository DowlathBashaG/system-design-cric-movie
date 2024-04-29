package io.dowlath.cric.teamdetails;

import java.util.List;

import io.dowlath.cric.users.Player;

public class Team {
	  private String name;
	  private List<Player> players;
	  private List<News> news;
	  private Coach coach;

	  public boolean addTournamentSquad(TournamentSquad tournamentSquad);
	  public boolean addPlayer(Player player);
	  public boolean addNews(News news);	
}
