
package org.packt.primeautosales.jsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;

/**
 *
 * @author User
 */
@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {

    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }
       public void layoutResizeEvent(ResizeEvent event){
         
     }
}
