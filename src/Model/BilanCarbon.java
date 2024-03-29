package Model;
import java.util.Hashtable;
public class BilanCarbon {
    private int loco_voiture ;
    private int loco_covoiturage;
    private int loco_velo;
    private int loco_transports;
    private int loco_autres;
    private Hashtable<String, Double> co2Min;
    private Hashtable<String, Double> co2Max;

    public BilanCarbon(int loco_voiture, int loco_covoiturage, int loco_velo, int loco_transports, int loco_autres){
        this.loco_voiture = loco_voiture;
        this.loco_covoiturage = loco_covoiturage;
        this.loco_velo = loco_velo;
        this.loco_transports = loco_transports;
        this.loco_autres = loco_autres;
        co2Min = new Hashtable<>();
        co2Max = new Hashtable<>();
    }
    public double getCo2Min(String h) {
        return co2Min.get(h);
    }
    public double getco2Max(String h){
        return co2Max.get(h);
    }

}