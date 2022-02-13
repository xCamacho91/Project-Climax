import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class instructions extends World
{

    /**
     * Constructor for objects of class instructions.
     * 
     */
    public instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Voltar voltar = new Voltar();
        addObject(voltar,50,520);
        voltar.setLocation(0,560);
    }
}
