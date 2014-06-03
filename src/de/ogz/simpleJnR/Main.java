package de.ogz.simpleJnR;

import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AppState;

import de.ogz.simpleJnR.appStates.*;
import java.util.logging.Level;

import java.util.logging.Logger;


/**
 * test
 * @author burndaflame
 */
public class Main extends SimpleApplication {
    private static final Logger rootLogger = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }
    
    @Override
    public void simpleInitApp() {
        AppState inGame = new InGame();
        AppState inMenu = new InMenu();
        //AppState inGame = new InGame();
        stateManager.attach(inGame);
        stateManager.attach(inMenu);
        inGame.setEnabled(false);
        inMenu.setEnabled(true);
    }
    
    @Override
    public void simpleUpdate(float tpf) {
        
    }
}