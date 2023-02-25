
package jarmu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author SZékely Balázs
 */
public class Orszagut {

    private static ArrayList<Jarmu> lista = new ArrayList<>();
    //private static final String PATH = "jarmuvek.txt";
    
    public static void jarmuvekJonnek(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String sor = br.readLine();
        while(sor != null){
            //System.out.println(sor);
            String[] adatok = sor.split(";");
            if(adatok[0].equals("robogo")){
                Robogo r = new Robogo(Integer.parseInt(adatok[3]), Integer.parseInt(adatok[2]), adatok[1]);
                lista.add(r);
            }
            else if (adatok[0].equals("audi")){
                AudiS8 a = new AudiS8(Boolean.parseBoolean(adatok[3]), Integer.parseInt(adatok[2]), adatok[1]);
                lista.add(a);
            }
            sor = br.readLine();
        }
        br.close();
    }
    
    public static void kiketMertunkBe() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("buntetes.txt"));
        for (Jarmu jarmu : lista) {
            if(jarmu instanceof AudiS8){
                bw.write(jarmu.toString() + (jarmu.gyorshajtottE(90) ? ", gyorshajtott" : ", megfelelõ sebesség") + "\n");
            }
            else if(jarmu instanceof Robogo){
                bw.write(jarmu.toString() + ((((Robogo) jarmu).haladhatItt(90)) ? ", haladhat itt" : ", nem haladhat itt") + "\n");
            }
        }
        
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        jarmuvekJonnek(args[0]);
        kiketMertunkBe();
    }
    
}
