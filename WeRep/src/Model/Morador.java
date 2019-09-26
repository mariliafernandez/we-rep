/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Álvaro Queiroz
 */
public class Morador {
    private Double saldo;
    private String nome;
    private String sobreNome;
    private String email;
    private String login;
    private String senha;
    private Republica republica;
    
    public Morador(Double saldo, String nome, String sobreNome,Republica republica) {
        this.saldo = saldo;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.republica = republica;
    }
    public Morador() {
    }
    
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getRepublica() {
        return republica;
    }

    public void setRepublica(Republica republica) {
        this.republica = republica;
    }
    
    @Override
    public String toString() {
        return "Morador{" + "saldo=" + saldo + ", nome=" + nome + ", sobreNome=" + sobreNome + ", email=" + email + ", login=" + login + ", senha=" + senha + ", republica="+ republica +'}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.saldo);
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.sobreNome);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.login);
        hash = 37 * hash + Objects.hashCode(this.senha);
        hash = 37 * hash + Objects.hashCode(this.republica);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Morador other = (Morador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sobreNome, other.sobreNome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.saldo, other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.republica, other.republica)) {
            return false;
        }
        return true;
    }
    
}
