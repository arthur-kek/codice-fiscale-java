package cities_codes;

import java.util.Map;
import java.util.TreeMap;

import utils.Utils;

@SuppressWarnings("serial")
public class CitiesCodes extends TreeMap<String, String> {

    CitiesCodes_A ccA = new CitiesCodes_A();
    CitiesCodes_B ccB = new CitiesCodes_B();
    CitiesCodes_C ccC = new CitiesCodes_C();
    CitiesCodes_D ccD = new CitiesCodes_D();
    CitiesCodes_E ccE = new CitiesCodes_E();
    CitiesCodes_F ccF = new CitiesCodes_F();
    CitiesCodes_G ccG = new CitiesCodes_G();
    CitiesCodes_H ccH = new CitiesCodes_H();
    CitiesCodes_I ccI = new CitiesCodes_I();
    CitiesCodes_L ccL = new CitiesCodes_L();
    CitiesCodes_M ccM = new CitiesCodes_M();
    CitiesCodes_Z ccZ = new CitiesCodes_Z();

    public CitiesCodes(){
        this.putAll(ccA);
        this.putAll(ccB);
        this.putAll(ccC);
        this.putAll(ccD);
        this.putAll(ccE);
        this.putAll(ccF);
        this.putAll(ccG);
        this.putAll(ccH);
        this.putAll(ccI);
        this.putAll(ccL);
        this.putAll(ccM);
        this.putAll(ccZ);
    }

    public String getKey(String s){
        String res = Utils.ERROR;
        String cityName = s.toUpperCase();
        for (Map.Entry<String, String> e : this.entrySet()) {
            if(cityName.equals(e.getValue()))
                res = e.getKey();
        }
        return res;
    }

}
