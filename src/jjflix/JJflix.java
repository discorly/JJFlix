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
import java.util.List;
import javax.swing.*;

/**
 *
 * @author KIMP
 */
public class JJflix {
    private NewJFrame jflx;
    
    public JJflix() {
        jflx = new NewJFrame();
        jflx.setVisible(true);
        jflx.setTitle("JJFlix");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JJflix jjflix = new JJflix();
    }
}




