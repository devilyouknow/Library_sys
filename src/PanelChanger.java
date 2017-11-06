/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library_sys;

import javax.swing.JPanel;
import roundPanel.roundedPanel;

/**
 *
 * @author Salitha Kaweendra
 */
class PanelChanger {

    public PanelChanger(JPanel c, JPanel cc) {
        c.removeAll();
        c.add(cc);
        c.repaint();
        c.revalidate();
    }
    
    public void  removePanel(JPanel c, JPanel cc) {
    
      c.removeAll();
      c.repaint();
      c.revalidate();
    
}

    }