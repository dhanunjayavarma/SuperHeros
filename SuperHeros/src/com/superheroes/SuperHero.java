package com.superheroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SuperHero {
	private ArrayList<String> names = new ArrayList<String>(
			Arrays.asList("SUPERMAN", "THOR", "ROBIN", "IRONMAN", "GHOSTRIDER", "CAPTAINAMERICA", "FLASH", "WOLVERINE",
					"BATSMAN", "HULK", "BLADE", "PHANTOM", "SPIDERMAN", "BLACKWIDOW", "HELLOBOY", "PUNISHER"));

	private HashMap<String, String> superHeroes;

	public SuperHero() {
		superHeroes = createSuperHeroesCodes(names);
	}

	public String getSuperHero(String code) {
		return superHeroes.get(code);
	}

	private static HashMap<String, String> createSuperHeroesCodes(ArrayList<String> names) {
		HashMap<String, String> namesWithCodes = new HashMap<String, String>();
		for (int i = 0; i < names.size(); i++) {
			namesWithCodes.put(genarateCode(names.get(i)), names.get(i));
		}
		return namesWithCodes;
	}

	private static String genarateCode(String name) {
		String code = "";
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c == 'A' || c == 'B' || c == 'C') {
				code = code + "2";
			} else if (c == 'D' || c == 'E' || c == 'F') {
				code = code + "3";
			} else if (c == 'G' || c == 'H' || c == 'I') {
				code = code + "4";
			} else if (c == 'J' || c == 'K' || c == 'L') {
				code = code + "5";
			} else if (c == 'M' || c == 'N' || c == 'O') {
				code = code + "6";
			} else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
				code = code + "7";
			} else if (c == 'T' || c == 'U' || c == 'V') {
				code = code + "8";
			} else if (c == 'W' || c == 'X' || c == 'Y' | c == 'Z') {
				code = code + "9";
			}
		}
		return code;
	}

}
