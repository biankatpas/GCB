package model.bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-11-23T15:56:29.838-0200")
@StaticMetamodel(IngredienteReceita.class)
public class IngredienteReceita_ {
	public static volatile SingularAttribute<IngredienteReceita, Long> id;
	public static volatile SingularAttribute<IngredienteReceita, Ingrediente> ingrediente;
	public static volatile SingularAttribute<IngredienteReceita, Integer> qtd;
}
