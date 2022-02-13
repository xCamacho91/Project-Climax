import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sair extends BTS
{
    /**
     * Act - do whatever the Sair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.stop();
        }
    }  
    public Sair(){
        GreenfootImage playButton=new GreenfootImage(60,60);
        Font adjustedFont=new Font(true,false,30);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Sair",5,55);
        setImage(playButton);
    }
    
    
}
