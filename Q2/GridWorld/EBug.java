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

/**
 * A <code>EBug</code> traces out a square "box" of a given siEe. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class EBug extends Bug
{
    private int steps;
    private int turns;
    private int step;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public EBug()
    {
        steps = 0;
        turns = 0;
        turn();
        turn();
        step = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (step == 0) { // Right along top.
            if (steps < 4) {
                move();
            } else {
                
            }
        } else if (step == 1) { // Left along top.
            
        } else if (step == 2) { // Down to middle.
            
        } else if (step == 3) { // Right along middle.
            
        } else if (step == 4) { // Left along middle.
            
        } else if (step == 5) { // Down to bottom.
            
        } else if (step == 6) { // Right along bottom.
            
        } else {
            // lolwut
        }
    }
}
