/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Morador;

/**
 *
 * @author Leonardo Mateus
 */
public class MoradorController {

    public static void addMorador(Morador morador) {
        String sql;
        sql = "INSERT INTO morador VALUES(default,'" + morador.getNome() + "','" + morador.getSobreNome() + "','" + morador.getEmail() + "','" + morador.getLogin() + "','" + morador.getSenha() + "',0);";

        boolean hasSucess = DataBase.inSQL(sql);
        /*Só pra testar*/
        if (hasSucess) {
            System.out.print("Cadastro realizado");
        } else {
            System.out.print("Erro");
        }
    }

    public static void removeMorador(String moradorID) {
        String sql = "DELETE FROM morador WHERE mor_codigo=" + moradorID;

        boolean hasSucess = DataBase.updSQL(sql);

        if (hasSucess) {
            //mensagem de sucesso 
        } else {
            //mensage de erro
        }
    }
    public static int getIdMorador(String login){
        String sql = "Select mor_codigo FROM morador WHERE mor_login = '" + login+"'";

        ResultSet result = DataBase.setResult(sql);
       
        try {
             result.next();
            return result.getInt("mor_codigo");
        } catch (SQLException ex) {
            Logger.getLogger(MoradorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    public static Morador selectMorador(String login) {
        String sql = "Select * FROM morador WHERE mor_login = '" + login+"';";

        ResultSet result = DataBase.setResult(sql);
        Morador morador = new Morador();
        try {
            result.next();
            
                morador.setEmail(result.getString("mor_email"));
                morador.setLogin(result.getString("mor_login"));
                morador.setNome(result.getString("mor_pnome"));
                morador.setSobreNome(result.getString("mor_unome"));
                morador.setSenha(result.getString("mor_senha"));
                morador.setSaldo(result.getDouble("mor_saldo"));
            // morador = new Morador(result.getInt("mor_codigo"), result.getString("Morador_Desc"), result.getDouble("Morador_Valor"));
        } catch (SQLException exception) {
            System.out.println("Error Select from database");
        }
        return morador;
    }

    public static List<Object> selectMoradors() {

        String sql = "Select * FROM morador";

        ResultSet result = DataBase.setResult(sql);

        List<Object> moradores = new ArrayList<>();
        try {
            while (result.next()) {
                Morador morador = new Morador();
                morador.setEmail(result.getString("mor_email"));
                morador.setLogin(result.getString("mor_login"));
                morador.setNome(result.getString("mor_pnome"));
                morador.setSobreNome(result.getString("mor_unome"));
                morador.setSenha(result.getString("mor_senha"));
                morador.setSaldo(result.getDouble("mor_saldo"));
                                
                //morador = new Morador(result.getInt("mor_codigo"), result.getString("Morador_Desc"), result.getDouble("Morador_Valor"));
                moradores.add(morador);
            }
        } catch (SQLException exception) {
            System.out.println("Error Select from database");
        }
        return moradores;
    }

    public static List<Object> selectMoradores(Morador mor){
        
        String sql = "Select * from morador where mor_login != '"+mor.getLogin()+"';";   
        
        ResultSet result = DataBase.setResult(sql);

        List<Object> moradores = new ArrayList<>();
        try {
            while (result.next()) {
                Morador morador = new Morador();
                morador.setEmail(result.getString("mor_email"));
                morador.setLogin(result.getString("mor_login"));
                morador.setNome(result.getString("mor_pnome"));
                morador.setSobreNome(result.getString("mor_unome"));
                morador.setSenha(result.getString("mor_senha"));
                morador.setSaldo(result.getDouble("mor_saldo"));
                                
                //morador = new Morador(result.getInt("mor_codigo"), result.getString("Morador_Desc"), result.getDouble("Morador_Valor"));
                moradores.add(morador);
            }
        } catch (SQLException exception) {
            System.out.println("Error Select from database");
        }
        return moradores;
        
    }
    
    public static Morador updateMorador(Morador mor) {
        Morador atualizado = new Morador();
        System.out.println(mor.getLogin());
        String sql = "UPDATE morador SET mor_pnome='" + mor.getNome() + "',mor_unome = '" + mor.getSobreNome() + "',mor_email = '" + mor.getEmail() + "',mor_senha = '" + mor.getSenha() + "' WHERE mor_login='" + mor.getLogin() + "';";

        boolean hasSucess = DataBase.updSQL(sql);

        if (hasSucess) {
            System.out.println("Alterado com sucesso!");
            atualizado = login(mor);
            return atualizado;
        } else {
            System.out.println("Erro");
            return mor;
        }

    }

    public static Morador login(Morador morador) {
        String sql = "Select * FROM morador where mor_login = '" + morador.getLogin() + "' and mor_senha = '" + morador.getSenha() + "';";

        ResultSet result = DataBase.setResult(sql);
        Morador usuario = new Morador();
        try {
            while (result.next()) {

                usuario.setNome(result.getString("mor_pnome"));
                usuario.setSobreNome(result.getString("mor_unome"));
                usuario.setEmail(result.getString("mor_email"));
                usuario.setLogin(result.getString("mor_login"));
                usuario.setSenha(result.getString("mor_senha"));
                usuario.setSaldo(result.getDouble("mor_saldo"));

            }
        } catch (SQLException errSql) {
            System.out.println("Error de SQL " + errSql + "! -- Erro na Consulta");
            System.exit(0);
        }
        if (usuario.getNome() != null) {
            return usuario;
        } else {
            return null;
        }

    }

}
