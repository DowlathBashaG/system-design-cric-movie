package io.dowlath.cric.matchdetails;

import java.util.List;

import io.dowlath.cric.enums.BallType;
import io.dowlath.cric.users.Player;

public class Ball {
	private Player balledBy;
	private Player playedBy;
	private BallType type;

	private Wicket wicket;
	private List<Run> runs;
	private Commentary commentary;
}
