package smsservice;

class SMSService {
	private String sms;
	private String superHeroName;
	private Translator translator;

	public void readSms(String sms) {
		this.sms = sms;
	}

	public void callSuperHero() {
		translator = new Translator();
		superHeroName = translator.translate(sms);
		System.out.print("calling " + superHeroName + " to Rescue");
	}
}