package textrpg;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Driver where the main code loop happens in the game
 * @author Ken Douglas
 */
public class TextRPGDriver {
    public static void main(String[] args){
        /*
        This is where the main driver method will make calls to the RPG methods who will
        pull all the data from the data structures.
        Player data is saved via text file. Upon death a last will and testament is saved amd can be reloaded as a new player descendent.

        Add a memory system where if a player tries to play as dead charecter instead reads them their date of birth and death.
        */

            Weapon test = new Weapon();

            test.createWeapon();

            test.createWeapon();


    
    }
}
