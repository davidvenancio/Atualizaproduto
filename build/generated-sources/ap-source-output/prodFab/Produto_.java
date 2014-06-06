package prodFab;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import prodFab.Fabricante;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-05T20:11:56")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, BigDecimal> valorCusto;
    public static volatile SingularAttribute<Produto, Fabricante> idFabricante;
    public static volatile SingularAttribute<Produto, String> foto;
    public static volatile SingularAttribute<Produto, BigDecimal> valorVenda;
    public static volatile SingularAttribute<Produto, String> cod;
    public static volatile SingularAttribute<Produto, Integer> id;
    public static volatile SingularAttribute<Produto, String> descricao;

}