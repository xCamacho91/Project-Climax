import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class newo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class newo extends World
{

    /**
     * Constructor for objects of class newo.
     * 
     */
    public newo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setText();
        
    }
    private void setText(){//coloca as class instaciadas para apresentar a informação
          
        Info info = new Info(novo.score, novo.index);
        addObject(info,24,41);
        info.setLocation(570,250);
        
        Jogar jogar = new Jogar();
        addObject(jogar,24,41);
        jogar.setLocation(500,400);
        
        Sair sair = new Sair();
        addObject(sair,493,493);
        sair.setLocation(500,450);
        
    }
    
    
    
}
