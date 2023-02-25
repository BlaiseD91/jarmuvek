/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarmu;

/**
 *
 * @author Székely Balázs
 */
public class AudiS8 extends Jarmu {
    private boolean lezerblokkolo;

    public AudiS8(boolean lezerblokkolo, int aktualisSebesseg, String rendszam) {
        super(aktualisSebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if(this.lezerblokkolo) return false;
        else{
            if(this.aktualisSebesseg > sebessegkorlat) return true;
            else return false;
        }
    }

    @Override
    public String toString() {
        return "Audi " + super.toString();   
    }
    
    
}
