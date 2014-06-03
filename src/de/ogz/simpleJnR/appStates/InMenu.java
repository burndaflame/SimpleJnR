/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ogz.simpleJnR.appStates;

import com.jme3.app.Application;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import de.ogz.simpleJnR.Main;

/**
 *
 * @author Sven
 */
public class InMenu extends AbstractAppState{
    private Main app;
    
    @Override
    public void initialize(AppStateManager stateManager, Application app) {
      super.initialize(stateManager, app); 
      this.app = (Main)app;
      // TODO
   }
 
   @Override
    public void cleanup() {
       // TODO
    }
 
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if(enabled){
            
        }
        else{
            
        }
    }
 
    // Note that update is only called while the state is both attached and enabled.
    @Override
    public void update(float tpf) {
      // TODO
    }
}