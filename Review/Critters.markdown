# Critter Test Review

Please do not use this as an answer key, all of these are probably wrong.

11. B
12. D
13. A
14. D
15. E
16. C
17. A
18. B
19. D
20. A
21. B
22. D
23. E
24. C
25. B
26. A

## 2008 Free-Response Question #3

### A

public void processActors(ArrayList<Actor> actors) {
	int friends = 0;
	int foes = 0;
	int neithers = 0;
	
	for (Actor a : actors) {
		if (isFriend(a))
			friends++;
		else if (isFoe(a))
			foes++;
		else
			neithers++;
	}
	
	if (friends > foes)
		setColor(Color.ORANGE);
	else
		setColor(Color.BLACK);
}

### B

public Location selectMoveLocation(ArrayList<Location> locs) {
	if (getColor() == Color.BLACK)
		for (Location l : locs) {
			super.act();
			numStepsDead++;
		}
	else {
		super.act();
		numStepsDead = 0;
    	}
}