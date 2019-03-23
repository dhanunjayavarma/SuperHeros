package superheors;
class SMSService{
    private String sms;
    private String superHeroName;
    private Translator translator;
    public void readSms(String sms){
        this.sms=sms;
    }
    public void translateMessage(){
        superHeroName=translator.translate(sms);
    }
    public void callSuperHero(){
        translateMessage();
        System.out.print("calling super hero");
    }
}