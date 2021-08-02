package com.objectmasterpt2;

public class TestHuman {

	public static void main(String[] args) {
		Ninja dipinder = new Ninja();
		Samurai james = new Samurai();
		dipinder.steal(james);
		james.deathBlow(dipinder);
		dipinder.showHealth();
		james.showHealth();
	}

}
