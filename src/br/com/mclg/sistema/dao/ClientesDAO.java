
package br.com.mclg.sistema.dao;

import br.com.mclg.sistema.jdbc.ConexaoBanco;
import br.com.mclg.sistema.model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientesDAO {
    private Connection connection;
    
    public ClientesDAO(){
        this.connection = new ConexaoBanco().pegarConexao();
    }
    
    public void Salvar(Clientes obj){
        try {
            // 1º passo criar o SQL
            String sql = "insert into tb_clientes (nome, rg, cpf, email, telefone, "
                       + "celular, cep, endereco, numero, complemento, bairro, cidade, estado)"
                       + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            // 2º passo preparar a conexão SQL para se conectar com o banco
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            
            // 3º passo será executar o sql
            stmt.execute();
            
            // 4º passo fechar conexão
            stmt.close();;
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO ao salvo cliente"+erro);
        }
    }
}
