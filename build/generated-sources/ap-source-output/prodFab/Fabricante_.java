package prodFab;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import prodFab.Produto;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-05T20:11:56")
@StaticMetamodel(Fabricante.class)
public class Fabricante_ { 

    public static volatile SingularAttribute<Fabricante, String> site;
    public static volatile SingularAttribute<Fabricante, String> nomeFab;
    public static volatile CollectionAttribute<Fabricante, Produto> produtoCollection;
    public static volatile SingularAttribute<Fabricante, Integer> id;

}