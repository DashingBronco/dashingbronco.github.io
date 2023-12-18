package textrpg;
import java.io.RandomAccessFile;

import java.io.IOException;
/**
 * Weapon class that pulls from the weaponDATA.txt file and writes to it.
 */
public class Weapon implements WeaponInterface{

    //Variables

    RandomAccessFile weaponFile;

    int damage;

    int rarity;

    int staminaCost;

    String name;

    private int weaponID;


    public Weapon(){

        damage = DEFAULT_DAMAGE;

        rarity = COMMON;

        staminaCost = DEFAULT_STAMINA_COST;

        name = "Sharp2";

        try {

            


            

            weaponFile = new RandomAccessFile("weaponDATA.txt", "rw");



        } catch (IOException ex) {
            System.out.println("Weapon file error");
            ex.printStackTrace();
        }
    }

    public void createWeapon(){  
         try {
            weaponFile.seek(weaponFile.length());

            weaponFile.writeInt(rarity);

            //weaponFile.seek(0);

            weaponFile.writeInt(damage);

            //weaponFile.seek(0);

            weaponFile.writeInt(staminaCost);

            //weaponFile.seek(0);

            weaponFile.writeUTF(name);

            weaponFile.writeUTF("\n");

            


        } catch (IOException ex) {
            System.out.println("Weapon file error");
            ex.printStackTrace();
        }
    }



}
