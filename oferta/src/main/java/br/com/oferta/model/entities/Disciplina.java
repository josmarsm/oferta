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
@Table (name="disciplina")
public class Disciplina implements Serializable {
    
    private static final long serialVersionUID =  1L;
    
    @Id
    @GeneratedValue
    @Column(name="idDisciplina", nullable=false)
    private Integer iddisciplina;
    @Column (name="codDisciplina", nullable = false, length = 10 )
    private String coddisciplina;
    @Column (name="Disciplina", nullable = false, length = 50 )
    private String disciplina;

    public Disciplina() {
    }

    public Integer getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(Integer iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    public String getCoddisciplina() {
        return coddisciplina;
    }

    public void setCoddisciplina(String coddisciplina) {
        this.coddisciplina = coddisciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (this.iddisciplina != null ? this.iddisciplina.hashCode() : 0);
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
        final Disciplina other = (Disciplina) obj;
        if (this.iddisciplina != other.iddisciplina && (this.iddisciplina == null || !this.iddisciplina.equals(other.iddisciplina))) {
            return false;
        }
        return true;
    }
    
}   