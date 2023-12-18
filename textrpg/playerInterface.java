package textrpg;
/**
 * Interface for the player
 * @author Ken Douglas
 */
public interface PlayerInterface {

    //Starting stats
    public final int DEFAULT_HEALTH = 100;
    public final int DEFAULT_MAGIC = 50;
    public final int DEFAULT_STAMINA = 50;
    public final int DEFAULT_LEVEL = 1;
    public final int DEFAULT_MORALITY = 50;
    //Add data types of spells, weapons, and items. Put them in arrays.

    //Methods for the player to various actions from attacking to crafting

    /**
     * Getter methods for player's stats
     */
     public int getHP();
     public int getMagic();
     public int getStamina();
     public int getLevel();
     public int getMorality();

    /**
    * Lose X from the player's pools of stats.
    */
    public void loseHP(int lose);
    public void loseMagic(int lose);
    public void loseStamina(int lose);
    public void loseMorality(int lose);

    /**
    * Gain X towards the player's pool of stats.
    */
    public void gainHP(int gain);
    public void gainMagic(int gain);
    public void gainStamina(int gain);
    public void gainMorality(int gain);

    /**
    * Level up method for when the player gains enough XP
    */
    public void levelUp();






}
