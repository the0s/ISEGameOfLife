package ise.gameoflife.participants;

import ise.gameoflife.models.Food;
import ise.gameoflife.models.HuntingTeam;
import ise.gameoflife.participants.AgentDataModel;
import java.util.ArrayList;
import presage.PlayerDataModel;

import java.io.Serializable;

/**
 * The amount of information an Agent can find out about another agent
 * @author Benedict Harcourt
 */
public final class PublicAgentDataModel implements PlayerDataModel, Serializable
{
	private static final long serialVersionUID = 1L;
	/**
	 * Data Model which backs this public data model
	 */
	private AgentDataModel source;

	/**
	 * Constructor for PublicAgentDataModel
	 * @param source the Data model which backs the public data model
	 */
	PublicAgentDataModel(AgentDataModel source)
	{
		this.source = source;
	}

	/**
	 * Gets the id of the agent
	 * @return the id of the agent
	 */
	@Override
	public String getId()
	{
		return source.getId();
	}

	/**
	 * Gets the amount of food this agent has available to them
	 * @return the amount of food this agent has available to them
	 */
	public double getFoodAmount()
	{
		return source.getFoodInPossesion();
	}
	/**
	 * Gets time: the number of cycles (which are the subdivision of rounds) which have passed
	 * @return the time (number of cycles which have passed)
	 */
	@Override
	public long getTime()
	{
		return source.getTime();
	}
	/**
	 * Sets the time
	 * setTime should not used since the simulation deals with setting the time - calling this will have no effect.
	 * @param time the time to set
	 */
	@Override
	public void setTime(long time)
	{
		source.setTime(time);
	}
	/**
	 * Returns the list of roles which the agent has
	 * @return a list of roles
	 */
	@Override
	public ArrayList<String> getRoles()
	{
		return source.getRoles();
	}
	/**
	 * Sets all of the agents roles
	 * @param roles the list of roles to assign to the agent
	 */
	@Override
	public void setRoles(ArrayList<String> roles)
	{
		source.setRoles(roles);
	}
	/**
	 * Implemented in Presage and (currently) serves no purpose
	 * @return a null string, at the moment
	 */
	@Override
	public String getPlayerClass()
	{
		return source.getPlayerClass();
	}

	/**
	 * @return The food the agent decided to hunt on the previous turn
	 */
	public Food getLastHunted()
	{
		return source.getLastHunted();
	}

	/**
	 * @return which hunting pair this agent belongs to
	 */
	public HuntingTeam getHuntingTeam() {
		return source.getHuntingTeam();
	}

	/**
	 * The food that this agent has been ordered to hunt with it's team in this
	 * round
	 * @return Food that was ordered 
	 */
	public Food getOrder()
	{
		return source.getOrder();
	}

	/**
	 * Gets the group ID of the agent
	 * @return the group ID of the agent
	 */
	public String getGroupId()
	{
		return source.getGroupId();
	}
}
