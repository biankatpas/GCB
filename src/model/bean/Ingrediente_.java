package model.bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-11-23T15:56:29.837-0200")
@StaticMetamodel(Ingrediente.class)
public class Ingrediente_ {
	public static volatile SingularAttribute<Ingrediente, Long> id;
	public static volatile SingularAttribute<Ingrediente, String> descricao;
	public static volatile SingularAttribute<Ingrediente, IngredienteSubstituto> substituto;
}
