package superheors;
public class CrimeZeroIncApp {
    public static void main(String args[]){
        SMSService smsService= new SMSService();
        smsService.readSms("0 123");
        smsService.callSuperHero();
    }
}
