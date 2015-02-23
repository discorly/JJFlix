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
import javax.swing.JFrame;

/**
 *
 * @author KIMP
 */
public class JJflix {   
    Target flixBtn = new ImageTarget(new File("jjflix.png"));
    ScreenRegion fullScreen = new DesktopScreenRegion();
        
    ScreenRegion flix = fullScreen.find(flixBtn);
        
    Mouse mouse = new DesktopMouse();
    
    int found = 0;
    
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
        found = 0;
        for(int i = 0; i < 1000; i++) {
            findButton();
            sleep();
            break;
        }
    }
    
    public void findButton() {
        try {
            flix.find(flixBtn);
            mouse.click(fullScreen.getCenter());
            System.out.println("Found");
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
        if(flix.find(flixBtn) != null) {
            found = 1;
        } else {
            loopButton();
        }
    }
    
    public void sleep() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println();
        }
    }
    
}




