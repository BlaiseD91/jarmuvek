
package jarmu;

/**
 *
 * @author Sz�kely Bal�zs
 */
public abstract class Jarmu {
    protected int aktualisSebesseg;
    private String rendszam;

    public Jarmu(int aktualisSebesseg, String rendszam) {
        this.aktualisSebesseg = aktualisSebesseg;
        this.rendszam = rendszam;
    }
    
    public abstract boolean gyorshajtottE(int sebessegkorlat); //az adott j�rm� gyorshajtott-e

    @Override
    public String toString() {
        return rendszam + " - " + aktualisSebesseg + "km/h";
    }
    
    
    
    
}
