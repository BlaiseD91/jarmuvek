
package jarmu;

/**
 *
 * @author Székely Balázs
 */
public class Robogo extends Jarmu implements KisGepjarmu {
    private int maxSebesseg;

    public Robogo(int maxSebesseg, int aktualisSebesseg, String rendszam) {
        super(aktualisSebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        return this.aktualisSebesseg > sebessegkorlat ? true : false;
    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        return this.maxSebesseg < sebesseg ? true : false;
    }

    @Override
    public String toString() {
        return "Robogó: " + super.toString();
    }
    
    
    
}
