package smsservice;

import com.superheroes.SuperHero;

public class Translator {
	SuperHero superHero;

	public String translate(String key) {
		superHero = new SuperHero();
		return superHero.getSuperHero(key);
	}
}
