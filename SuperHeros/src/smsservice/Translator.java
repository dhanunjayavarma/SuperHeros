package smsservice;

import com.superheroes.SuperHero;

public class Translator {
	private SuperHero superHero;
	private String code;

	public String translate(String sms) {
		superHero = new SuperHero();
		code = getCode(sms);
		return superHero.getSuperHero(code);
	}

	private String getCode(String sms) {
		String[] sArray = sms.split(" ");
		return sArray[1];
	}
}
