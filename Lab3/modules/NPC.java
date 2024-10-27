package Lab3.modules;

/**
 * This class represents Non playable character in our game
 */
public class NPC {


    /**
     * Counter to count all the instances
     */
    static int counter = 0;

    /**
     * index unique to each instance, starting from 0
     */
    int index;

    /**
     * Possible values for sex (gender attributes)
     */
    public enum Sex {
        MALE, FEMALE
    };

    /**
     * Sex of and NPC character
     * 
     * @see Sex
     */
    public final Sex sex;

    /**
     * Name of NPC (can be a full name, or just a name like Jack)
     */
    public String name;

    /**
     * x coordinate of NPC in a game field
     */
    public int x;

    /**
     * y coordinate of NPC in a game field
     */
    public int y;

    /**
     * z coordinate of NPC in a game field
     */
    public int z;

    /**
     * Creates an instace of NPC (Non-Player Character) class
     * {@param} name - Name of a Non-playable character, is given once
     * {@param} sex - Sex value for NPC character, is given once and not chaged
     * {@param} x - x coordinate of characters position
     * {@param} y - y coordinate of characters position
     * {@param} z - z coordinate of characters position
     * {@returns} instance of an NPC
     */
    public NPC(
            String name,
            Sex sex,
            int x,
            int y,
            int z) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.sex = sex;
        this.index = NPC.counter++;
    }

    @Override
    public String toString() {
        return "\nNPC{" + "index=" + index + " name='" + name + "', coors='" + x + "," + y + "," + z
                + "', sex = " + sex
                + " }";
    }


}
