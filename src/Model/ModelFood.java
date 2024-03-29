package Model;

public class ModelFood {
    public enum Meal { VEGAN, VEGETARIEN, BOEUF, AUTRE_VIANDE_POISSON };

    private int nbVegan, nbVegetarien, nbBoeuf, nbAutreViandePoisson;

    int getnbVegan(){
        return this.nbVegan;
    }

    int getnbVegetarien(){
        return this.nbVegetarien;
    }
    int getnbBoeuf(){
        return this.nbBoeuf;
    }
    int getnbAutreViandePoisson(){
        return this.nbAutreViandePoisson;
    }

    public void setNbVegan(int nbVegan) {
        this.nbVegan = nbVegan;
    }

    public void setNbBoeuf(int nbBoeuf) {
        this.nbBoeuf = nbBoeuf;
    }

    public void setNbVegetarien(int nbVegetarien) {
        this.nbVegetarien = nbVegetarien;
    }

    public void setNbAutreViandePoisson(int nbAutreViandePoisson) {
        this.nbAutreViandePoisson = nbAutreViandePoisson;
    }


    public void init() {
        this.nbVegan=0;
        this.nbBoeuf=0;
        this.nbVegetarien=0;
        this.nbAutreViandePoisson=0;
    }


    public ModelFood(int nbVegan, int nbVegetarien, int nbBoeuf, int nbAutreViandePoisson){
        this.nbVegan = nbVegan;
        this.nbBoeuf =  nbBoeuf;
        this.nbVegetarien = nbVegetarien;
        this.nbAutreViandePoisson = nbAutreViandePoisson;
    }

    private static double getCO2(Meal m) {
        switch (m) {
            case VEGAN: return 0.4;
            case VEGETARIEN: return 0.5;
            case AUTRE_VIANDE_POISSON: return 1.1;
            case BOEUF: return 7;
            default: return 0;
        }
    }
    public void addMeals(Meal m, int q) {
        if(q > 0){
            switch (m) {
                case VEGAN: this.nbVegan +=q ; break ;
                case VEGETARIEN: this.nbVegetarien +=q; break ;
                case AUTRE_VIANDE_POISSON: this.nbAutreViandePoisson+=q; break ;
                case BOEUF: this.nbBoeuf+=q; break ;
            }
        }

    }
    public double computeCO2(Meal d) {
        return switch (d) {
            case VEGAN -> nbVegan * getCO2(d);
            case VEGETARIEN -> nbVegetarien * getCO2(d);
            case AUTRE_VIANDE_POISSON -> nbAutreViandePoisson * getCO2(d);
            case BOEUF -> nbBoeuf * getCO2(d);
        };
    }

}
