package model.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


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
    private List<Tag> tags;
    @OneToMany
    private List<ComentarioReceita> comentarios;
    @OneToMany
    private List<IngredienteReceita> ingredientes;

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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTag(Tag tag) {
        tags.add(tag);
    }

    public List<ComentarioReceita> getComentarios() {
        return comentarios;
    }

    public void setComentario(ComentarioReceita comentario) {
        comentarios.add(comentario);
    }

    public List<IngredienteReceita> getIngredientes() {
        return ingredientes;
    }

    public void setIngrediente(IngredienteReceita ingrediente) {
        ingredientes.add(ingrediente);
    }

}

