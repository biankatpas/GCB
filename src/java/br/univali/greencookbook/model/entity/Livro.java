/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.greencookbook.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author biankatpas
 */
@Entity
public class Livro extends BaseEntity implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    @OneToMany
    private ReceitaLivro receitaLivro;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public ReceitaLivro getReceitaLivro() {
        return receitaLivro;
    }

    public void setReceitaLivro(ReceitaLivro receitaLivro) {
        this.receitaLivro = receitaLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
