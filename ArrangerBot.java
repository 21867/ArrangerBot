import kareltherobot.*;
/**
 * Write a description of class Pinsetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrangerBot extends UrRobot
{
    /**
     * Constructor for objects of class ArrangerBot
     */
    public ArrangerBot(int st, int ave, Direction dir, int beeps)
    {
        super (3,3, East, 12);
    }
    
    public void arrangeBeepers()
    {
        oneWall();
        oneWall();
        oneWall();
        oneWall();
    }
    public void oneWall()
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        turnLeft();
    }  

}
