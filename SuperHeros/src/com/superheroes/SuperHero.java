package com.superheroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SuperHero {
	private ArrayList<String> namesList = new ArrayList<String>(
			Arrays.asList("SUPERMAN", "THOR", "ROBIN", "IRONMAN", "GHOSTRIDER", "CAPTAINAMERICA", "FLASH", "WOLVERINE",
					"BATSMAN", "HULK", "BLADE", "PHANTOM", "SPIDERMAN", "BLACKWIDOW", "HELLOBOY", "PUNISHER"));

	private HashMap<String, String> superHeroes;

	public SuperHero() {
		superHeroes = createMap(namesList);
	}

	public String getSuperHero(String key) {
		return superHeroes.get(key);
	}

	private static HashMap<String, String> createMap(ArrayList<String> namesList) {
		HashMap<String, String> myMap = new HashMap<String, String>();

		for (int i = 0; i < namesList.size(); i++) {

			myMap.put(genarateKey(namesList.get(i)), namesList.get(i));
		}
		return myMap;
	}

	private static String genarateKey(String value) {
		String key = "";
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if (c == 'A' || c == 'B' || c == 'C') {
				key = key + "2";
			} else if (c == 'D' || c == 'E' || c == 'F') {
				key = key + "3";
			} else if (c == 'G' || c == 'H' || c == 'I') {
				key = key + "4";
			} else if (c == 'J' || c == 'K' || c == 'L') {
				key = key + "5";
			} else if (c == 'M' || c == 'N' || c == 'O') {
				key = key + "6";
			} else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
				key = key + "7";
			} else if (c == 'T' || c == 'U' || c == 'V') {
				key = key + "8";
			} else if (c == 'W' || c == 'X' || c == 'Y' | c == 'Z') {
				key = key + "9";
			}
		}
		return key;
	}

}
