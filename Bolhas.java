import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bolhas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bolhas extends Actor
{
    private GreenfootImage imagem;
    /**
     * Act - do whatever the Bolhas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        dissipa();
    } 
    public void dissipa()
    {
        imagem=getImage();
        int transparenciaAtual=imagem.getTransparency();
        if(transparenciaAtual<10){
            getWorld().removeObject(this);
        }
        else{
            imagem.setTransparency(transparenciaAtual-10);
        }
    }
    private GreenfootImage imageBolhas;
    public Bolhas()
    {
        imageBolhas=getImage();
        int larguraActual=imageBolhas.getWidth();
        int alturaActual=imageBolhas.getHeight();
        imageBolhas.scale(larguraActual/15,alturaActual/15);
    }
    
}
