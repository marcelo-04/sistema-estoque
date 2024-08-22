
package br.com.mclg.sistema.utilitarios;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilitarios {
    public void LimpaTela(JPanel container){
        Component components[] = container.getComponents();
        for (Object component : components) {
            if (component instanceof JTextField jTextField) {
                jTextField.setText(null);
            }
        }
    }
}
