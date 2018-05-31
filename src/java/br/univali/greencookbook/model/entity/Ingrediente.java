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
import javax.persistence.OneToOne;

/**
 *
 * @author biankatpas
 */
@Entity
public class Ingrediente extends BaseEntity implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    @OneToOne
    private IngredienteSubstituto substituto;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public IngredienteSubstituto getSubstituto() {
        return substituto;
    }

    public void setSubstituto(IngredienteSubstituto substituto) {
        this.substituto = substituto;
    }

}
