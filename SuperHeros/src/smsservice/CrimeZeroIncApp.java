package smsservice;

public class CrimeZeroIncApp {
	public static void main(String args[]) {
		SMSService smsService = new SMSService();
		smsService.readSms("0 4855");
		smsService.callSuperHero();
	}
}
