import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BTS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BTS extends Actor
{
    /**
     * Act - do whatever the BTS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    private boolean mouseOver=false;
    private static int MAX_TRANS=255;
    
    public void checkMouse()
    {
        if(Greenfoot.mouseMoved(null)){
            mouseOver =Greenfoot.mouseMoved(this);
        }
        if(mouseOver){
            adjTrans(MAX_TRANS/2);
        }
        else{
            adjTrans(MAX_TRANS);
        }
        
    }
    public void adjTrans(int adjust){
        GreenfootImage tempImage=getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    public void checkClick(World world){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
        
    
}
