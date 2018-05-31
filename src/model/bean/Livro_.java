package model.bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-11-23T15:56:49.320-0200")
@StaticMetamodel(Livro.class)
public class Livro_ {
	public static volatile SingularAttribute<Livro, Long> id;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile ListAttribute<Livro, ReceitaLivro> receitas;
}
