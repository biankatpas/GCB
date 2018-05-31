package model.bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-11-23T15:59:08.733-0200")
@StaticMetamodel(Receita.class)
public class Receita_ {
	public static volatile SingularAttribute<Receita, Long> id;
	public static volatile SingularAttribute<Receita, String> titulo;
	public static volatile SingularAttribute<Receita, String> modoPreparo;
	public static volatile SingularAttribute<Receita, Integer> tempoPreparo;
	public static volatile SingularAttribute<Receita, Integer> redimento;
	public static volatile SingularAttribute<Receita, Integer> like;
	public static volatile SingularAttribute<Receita, Categoria> categoria;
	public static volatile ListAttribute<Receita, Tag> tags;
	public static volatile ListAttribute<Receita, ComentarioReceita> comentarios;
	public static volatile ListAttribute<Receita, IngredienteReceita> ingredientes;
}
