
package br.com.mclg.sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class TestarConexao {

    public static void main(String[] args) {
        try {
            new ConexaoBanco().pegarConexao();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso ao banco de dados!");
        } catch (HeadlessException erro) {
            JOptionPane.showMessageDialog(null, "ERRO ao tentar se conectar com banco de dados"+erro.getMessage());
        }
    }
    
}
