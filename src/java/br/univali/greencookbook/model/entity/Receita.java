/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.greencookbook.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author biankatpas
 */
@Entity
public class Receita extends BaseEntity implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    @Column(name = "modo_preparo")
    private String modoPreparo;
    @Column(name = "tempo_preparo")
    private int tempoPreparo;
    private int redimento;
    private int like;
    @ManyToOne
    private Categoria categoria;
    @OneToMany
    private Tag tag;
    @OneToMany
    private ComentarioReceita comentario;
    @OneToMany
    private IngredienteReceita ingrediente;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getRedimento() {
        return redimento;
    }

    public void setRedimento(int redimento) {
        this.redimento = redimento;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public ComentarioReceita getComentario() {
        return comentario;
    }

    public void setComentario(ComentarioReceita comentario) {
        this.comentario = comentario;
    }

    public IngredienteReceita getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(IngredienteReceita ingrediente) {
        this.ingrediente = ingrediente;
    }

}
