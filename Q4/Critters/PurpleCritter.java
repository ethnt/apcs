/* PurpleCritter turns things Purple.
 * 
 * @author Ethan Turkeltaub
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

public class PurpleCritter extends Critter {
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n == 0)
			setColor(new Color(255, 0, 255));
		int r = (int) (Math.random() * n);
		
		Actor other = actors.get(r);
		setColor(other.getColor());
	}

	public void makeMove(Location loc) {
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}
}
