import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class UnikeTall {
    
    int[] list;


    public UnikeTall(int lengde) {
        list = new int[lengde];

    }

    public boolean checkTalll(int tall)   {
        for (int i : list){
            if(tall == i){
                return false;
            }
        }return true;

    }

    public void tilfeldigTall() {


        for (int i = 0; i < list.length ; i++) {
            int randomTall = (int) (Math.random() * (999) + 100);

            if (checkTalll(randomTall)) {
                list[i] = randomTall;
            }


        }


    }

    public int minste() {
        int minsteTall = list[0];

        for (int liste1 : list) {
            if (liste1 < minsteTall) {
                minsteTall=liste1;
            }
        }
        return minsteTall;
    }

    public int største() {
        int størsteTall = list[0];

        for (int liste2 : list) {
            if (liste2 > størsteTall) {
                størsteTall=liste2;
            }
        }
        return størsteTall;
    }


    public double gjennomsnitt() {
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double snitt = sum / list.length;
        return snitt;
    }


    public void resultat() {
        String letters = Arrays.toString(list);
        String out ="";

            int counter = 0;
        for (int i = 0; i < list.length; i++) {

            out += list[i];
            out +=" ";       

            if (counter == 7 ){
                out +="\n";
                counter = 0;
            } else counter ++;
           
           

        }

            JOptionPane.showMessageDialog(null, out +"\n"+"\n"+"minste tallet er: "+minste()+"\n"+
                    "største taleet er: "+største()+"\n"+"gjenoom snitt er: "+String.format("%.2f", gjennomsnitt()));

    }


}

public class tallProgram {
    public static void main(String[] args) {

        UnikeTall kjør = new UnikeTall(60);
        kjør.tilfeldigTall();
        kjør.resultat();


    }
}
