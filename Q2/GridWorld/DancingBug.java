/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

import java.util.Random;

/**
 * A <code>DancingBug</code> traces out a square "Dancing" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private int numTurns;
    private int[] turns;

    /**
     * Constructs a Dancing bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] turnValues)
    {
        turns = turnValues;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (numTurns < turns.length) {
            for (int i : turns) {
                setDirection(i);
                numTurns++;
            }
        } else {
            super.act();
        }
    }
}
