/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjflix;
import org.sikuli.api.*;
import java.io.File;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;

/**
 *
 * @author KIMP
 */
public class JJflix {   
    Target flixBtn = new ImageTarget(new File("jjflix.png"));
    ScreenRegion fullScreen = new DesktopScreenRegion();
        
    Mouse mouse = new DesktopMouse();
    
    //Make the mouse click the button, not below it.
    ScreenLocation f = Relative.to(fullScreen).center().getScreenLocation();
    ScreenLocation p = Relative.to(f).above(20).getScreenLocation();
    
    public JJflix() {
        loopButton();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JJflix jjflix = new JJflix();
    }
    
    public void loopButton() {
        for(int i = 0; i < 1000; i++) {
            findButton();
            sleep();
        }
    }
    
    public void findButton() {
        try {
            ScreenRegion flix = fullScreen.find(flixBtn);
            flix.find(flixBtn);
            mouse.click(p);
            System.out.println("Found");
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void sleep() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
}




