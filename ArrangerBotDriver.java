import kareltherobot.*;
/**
 * Write a description of class NasaBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrangerBotDriver implements Directions
{
    public static void main(String args[])
    {
        ArrangerBot karel = new ArrangerBot(3,3,East, 12);
        karel.arrangeBeepers();
    }
    static
    {
    	World.reset();	
    	World.readWorld("ch3_9.kwld");
    	World.setDelay(1);
    	World.setVisible(true);    	
    }
    
}
