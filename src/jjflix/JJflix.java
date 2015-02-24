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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author KIMP
 */
public class JJflix {   
    ScreenRegion fullScreen = new DesktopScreenRegion();
    
    List<Target> targets = new ArrayList<Target>();
    
    Mouse mouse = new DesktopMouse();
    
    public JJflix() {
        targetsToArray();
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
            for(Target t: targets) {
                findButton(t);
            }
            sleep();
        }
    }
    
    public void findButton(Target t) {
        try {
            ScreenRegion flix = fullScreen.find(t);
            mouse.click(flix.getCenter());
            System.out.println("Found");
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void targetsToArray() {
        Target flixBtn = new ImageTarget(new File("JJFlix.png"));
        Target flixBtnFullscreen = new ImageTarget(new File("JJFlixfullscreen.png"));
        targets.add(flixBtn);
        targets.add(flixBtnFullscreen);
    }
}




