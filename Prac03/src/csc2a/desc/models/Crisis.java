/****
 * 
 * @author: KALOMBO_AK_218095095
 * @Prac 03
 */

package csc2a.desc.models;
import csc2a.desc.models.Events;

public class Crisis {
	private String CR_ID;
	private String CR_NAME;
	private String CR_TEAM;
	private Events[] CR_EVENTS;
	
	//constructor that will be used to initialize instances of the Crisis class
	public Crisis(String ID, String Name, String Team) {
		CR_ID = ID;
		CR_NAME = Name;
		CR_TEAM = Team;
		CR_EVENTS = new Events[-1];
	}

	//getters for private vars
	public String getID() {
		return (this.CR_ID);
	}
	public String getName() {
		return (this.CR_NAME);
	}
	public String getTeam() {
		return (this.CR_TEAM);
	}
	
	//helper method that will increase size of array
	public void resizeArray() {
		Events[] tempArr = new Events[CR_EVENTS.length + 1]; 
		System.arraycopy(CR_EVENTS, 0, tempArr, 0, CR_EVENTS.length);
		CR_EVENTS = tempArr;
	}
	
	//helper method that will decrease size of array
	public void SubtArray() {
		if(CR_EVENTS.length > 0) {
			Events[] tempArr = new Events[CR_EVENTS.length - 1];
			System.arraycopy(CR_EVENTS, 0, tempArr, 0, CR_EVENTS.length - 1);
			CR_EVENTS = tempArr;
		}
	}
	
	//method that will be used to add Events
	public void addEvent(Events event) {
		resizeArray();
		CR_EVENTS[CR_EVENTS.length-1] = event;
	}
}