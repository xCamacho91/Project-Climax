import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Voltar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Voltar extends BTS
{
    /**
     * Act - do whatever the Voltar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public Voltar(){
        GreenfootImage playButton=new GreenfootImage(150,90);
        Font adjustedFont=new Font(true,false,80);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("<-",100,50);
        setImage(playButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new Menu());
        
    }
    
}
