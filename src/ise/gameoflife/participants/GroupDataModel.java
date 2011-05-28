package ise.gameoflife.participants;

import ise.gameoflife.AbstractAgent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

/**
 * Stub for groups
 * @author Olly
 */
public class GroupDataModel implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/**
	 *Unique group identifier
	 */
	@Element
	protected UUID groupID;
	/**
	 * Identity of GroupDataModel Leader
	 */
	@Element
	protected String leader;
	/**
	 * Array list of GroupDataModel members
	 */
	@ElementList
	protected ArrayList<String>  memberList;

	/**
	 * Adds a specific Agent to a GroupDataModel
	 * @param agent The agent to add to the group
	 */
	protected	void addAgentToGroup(AbstractAgent agent){
		memberList.add(agent.getId());
	}
	/**
	 * Removes specific Agent from a GroupDataModel if Agent is member of that group
	 * Returns false if Agent was not member of the group.
	 * @param agent The agent to remove from the group
	 * @return Whether an agent was removed
	 */
	protected boolean removeAgentFromGroup(AbstractAgent agent){
		return memberList.remove(agent.getId());
	}

	/**
	 * Get the group id that this group has
	 * @return The UUID of this group
	 */
	public UUID getId()
	{
		return groupID;
	}
}