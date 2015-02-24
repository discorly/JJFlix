/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjflix;
import java.util.TimerTask;

/**
 *
 * @author KIMP
 */
public class checkUpdate extends TimerTask {
    private NewJFrame jflx;
    @Override
    public void run() {
        jflx = new NewJFrame();
        jflx.loopButton();
    }
}
