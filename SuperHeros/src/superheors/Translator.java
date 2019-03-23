package superheors;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Translator {
    private String sms;
    private ArrayList<String> superHeros=new ArrayList<String>(
            Arrays.asList("SUPERMAN","THOR","ROBIN","IRONMAN","GHOSTRIDER",
                    "CAPTAINAMERICA","FLASH","WOLVERINE","BATSMAN","HULK",
                    "BLADE","PHANTOM","SPIDERMAN","BLACKWIDOW","HELLOBOY","PUNISHER"));
    public String translate(String sms){

        return "TRANSLATED SMS";

    }
    private String getCorrespondingLetters(){

        return "abc";
    }
    private ArrayList<String> getSuperHerosHavingLength(){

        return null;
    }

}
