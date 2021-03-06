package ise.gameoflife.tokens;

/**
 * Used to control which turn type it is
 * @author Benedict
 */
public enum TurnType
{
	//Environment specifies which groups it has accepted agents into
	GroupSelect,
	
	//Group splits agents into hunting teams
	TeamSelect,
	
	//Agent specifies which food it wishes to obtain
	GoHunt,
	
	//Environment states what the result of each hunt has been
	HuntResults;

	public final static TurnType firstTurn = values()[0];
}
