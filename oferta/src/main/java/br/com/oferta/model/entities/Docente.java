/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oferta.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;
/**
 *
 * @author josmarsm
 */
@Entity
@Table (name="docente")
public class Docente implements Serializable {
    
    private static final long serialVersionUID =  1L;
    
    @Id
    @GeneratedValue
    @Column(name="idDocente", nullable=false)
    private Integer iddocente;
    @Column (name="Usuario", nullable = false, length = 45)
    private String usuario;
    @Column (name="Senha", nullable = false, length = 45)
    private String senha;
    @Column (name="Nome", nullable = false, length = 255)
    private String nome;
    @Column (name="Linha", nullable = false, length = 45)
    private String linha;

    public Docente() {
    }

    public Integer getIddocente() {
        return iddocente;
    }

    public void setIddocente(Integer iddocente) {
        this.iddocente = iddocente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.iddocente != null ? this.iddocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Docente other = (Docente) obj;
        if (this.iddocente != other.iddocente && (this.iddocente == null || !this.iddocente.equals(other.iddocente))) {
            return false;
        }
        return true;
    }    
}