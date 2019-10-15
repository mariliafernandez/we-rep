/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Álvaro
 */
@Entity
public class Morador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double saldo;
    @Column(length = 50)
    private String nome;
    @Column(length = 50)
    private String sobreNome;
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String login;
    @Column(length = 20)
    private String senha;
    private Republica republica;

    public Morador(Long id, Double saldo, String nome, String sobreNome, String email, String login, String senha, Republica republica) {
        this.id = id;
        this.saldo = saldo;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.republica = republica;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.saldo);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.sobreNome);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.login);
        hash = 29 * hash + Objects.hashCode(this.senha);
        hash = 29 * hash + Objects.hashCode(this.republica);
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
        if (!Objects.equals(this.id, other.id)) {
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

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
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

    public Republica getRepublica() {
        return republica;
    }

    public void setRepublica(Republica republica) {
        this.republica = republica;
    }

    @Override
    public String toString() {
        return "Morador{" + "id=" + id + ", saldo=" + saldo + ", nome=" + nome + ", sobreNome=" + sobreNome + ", email=" + email + ", login=" + login + ", senha=" + senha + ", republica=" + republica + '}';
    }
    
    
    
}
