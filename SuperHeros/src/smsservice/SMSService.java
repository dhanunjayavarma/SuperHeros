package smsservice;

class SMSService {
	private String code;
	private String sms;
	private String superHeroName;
	private Translator translator;

	public void readSms(String sms) {
		this.sms = sms;
		this.code = getCode(sms);

	}

	public String getCode(String sms) {
		String[] sArray = sms.split(" ");
		return sArray[1];
	}

	public void callSuperHero() {
		System.out.println(code);
		translator = new Translator();
		superHeroName = translator.translate(this.code);
		System.out.print("calling " + superHeroName + " to Rescue");
	}
}