import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scubas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scubas extends Actor
{
    /**
     * Act - do whatever the Scubas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        removeCopo();
        removeGarrafa();
        removeLata();
        removeOleo();
        removePneu();
        removeRede();
        removeSaco();
        removeTronco();
    }
    
    public void removeCopo(){
        if(isTouching(Copo.class)){
            getWorldOfType(novo.class).somaPontos(20);
            removeTouching(Copo.class);
        }
    }
    public void removeGarrafa(){
        if(isTouching(Garrafa.class)){
            getWorldOfType(novo.class).somaPontos(30);
            removeTouching(Garrafa.class);
        }
    }
    public void removeLata(){
        if(isTouching(Lata.class)){
            getWorldOfType(novo.class).somaPontos(30);
            removeTouching(Lata.class);
        }
    }
    public void removeOleo(){
        if(isTouching(Oleo.class)){
            getWorldOfType(novo.class).somaPontos(50);
            removeTouching(Oleo.class);
        }
    }
    public void removePneu(){
        if(isTouching(Pneu.class)){
            getWorldOfType(novo.class).somaPontos(50);
            removeTouching(Pneu.class);
        }
    }
    public void removeRede(){
        if(isTouching(Rede.class)){
            getWorldOfType(novo.class).somaPontos(90);
            removeTouching(Rede.class);
        }
    }
    public void removeSaco(){
        if(isTouching(Saco.class)){
            getWorldOfType(novo.class).somaPontos(10);
            removeTouching(Saco.class);
        }
    }
    public void removeTronco(){
        if(isTouching(Tronco.class)){
            getWorldOfType(novo.class).somaPontos(5);
            removeTouching(Tronco.class);
        }
    }
    
}
