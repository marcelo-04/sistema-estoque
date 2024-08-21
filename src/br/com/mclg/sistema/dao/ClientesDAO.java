
package br.com.mclg.sistema.dao;

import br.com.mclg.sistema.jdbc.ConexaoBanco;
import br.com.mclg.sistema.model.Clientes;
import java.sql.Connection;

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
            
        } catch (Exception e) {
        }
 
    }
}
