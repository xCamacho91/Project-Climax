import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public static GreenfootSound soundtrack =new GreenfootSound("som.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        Prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    
    
    private void Prepare()//inicialia as class com os respetivos botoes
    {
        Jogar jogar = new Jogar();
        addObject(jogar,24,41);
        jogar.setLocation(200,500);
        
        Instrucoes instruções = new Instrucoes();
        addObject(instruções,462,51);
        instruções.setLocation(830,480);

        Sair sair = new Sair();
        addObject(sair,493,493);
        sair.setLocation(900,540);
        
        
    }
    public void started()
    {
        soundtrack.play();
    }
    
}
