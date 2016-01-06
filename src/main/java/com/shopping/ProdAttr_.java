package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.196+0800")
@StaticMetamodel(ProdAttr.class)
public class ProdAttr_ {
	public static volatile SingularAttribute<ProdAttr, String> id;
	public static volatile SingularAttribute<ProdAttr, Attr> attr;
	public static volatile SingularAttribute<ProdAttr, Prod> prod;
	public static volatile SingularAttribute<ProdAttr, String> attrValue;
	public static volatile SingularAttribute<ProdAttr, String> lastUpdateBy;
	public static volatile SingularAttribute<ProdAttr, Date> lastUpdateTime;
	public static volatile SingularAttribute<ProdAttr, Integer> versionstamp;
}
