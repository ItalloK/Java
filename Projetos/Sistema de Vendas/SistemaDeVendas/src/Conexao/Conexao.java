package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class Conexao {
    
    private static Connection conection = null;
    
    public Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conection = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "root");

            Statement statement = conection.createStatement();
            boolean databaseExists = statement.execute("CREATE SCHEMA IF NOT EXISTS `dbVendas` DEFAULT CHARACTER SET utf8 ;");

            boolean tableExists = statement.execute("CREATE TABLE IF NOT EXISTS `dbVendas`.`Usuarios` ("
                    + "`idUsuarios` INT NOT NULL,"
                    + "`Nome` VARCHAR(45) NOT NULL,"
                    + "`CPF` VARCHAR(45) NOT NULL,"
                    + "`Telefone` VARCHAR(45) NOT NULL,"
                    + "`Endereco` VARCHAR(100) NOT NULL,"
                    + "`Foto` LONGBLOB NULL,"
                    + "PRIMARY KEY (`idUsuarios`)) "
                    + "ENGINE = InnoDB;");
            
            boolean tableExists2 = statement.execute("CREATE TABLE IF NOT EXISTS `dbVendas`.`OrdemDeServico` ("
                    + "`idOrdemDeServico` INT NOT NULL,"
                    + "`TipoDeServico` LONGTEXT NULL,"
                    + "`ValorServico` DOUBLE NULL,"
                    + "`DataDeEntrega` VARCHAR(45) NULL,"
                    + "`Usuarios_idUsuarios` INT NOT NULL,"
                    + "PRIMARY KEY (`idOrdemDeServico`),"
                    + "INDEX `fk_OrdemDeServico_Usuarios_idx` (`Usuarios_idUsuarios` ASC) VISIBLE,"
                    + "CONSTRAINT `fk_OrdemDeServico_Usuarios`"
                    + "FOREIGN KEY (`Usuarios_idUsuarios`)"
                    + "REFERENCES `dbVendas`.`Usuarios` (`idUsuarios`)"
                    + "ON DELETE NO ACTION"
                    + "ON UPDATE NO ACTION)"
                    + "ENGINE = InnoDB;");
            
            conection = DriverManager.getConnection("jdbc:mysql://localhost/dbVendas", "root", "root");
            return conection;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
