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
public class IngredientePedido extends BaseEntity implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private IngredienteReceita ingrediente;
    private float preco;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public IngredienteReceita getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(IngredienteReceita ingrediente) {
        this.ingrediente = ingrediente;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
