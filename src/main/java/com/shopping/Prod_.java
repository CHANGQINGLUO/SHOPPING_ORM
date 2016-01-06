package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.193+0800")
@StaticMetamodel(Prod.class)
public class Prod_ {
	public static volatile SingularAttribute<Prod, String> id;
	public static volatile SingularAttribute<Prod, Brand> brand;
	public static volatile SingularAttribute<Prod, Cate> cate;
	public static volatile SingularAttribute<Prod, String> prodCode;
	public static volatile SingularAttribute<Prod, String> prodName;
	public static volatile SingularAttribute<Prod, Boolean> isActive;
	public static volatile SingularAttribute<Prod, String> lastUpdateBy;
	public static volatile SingularAttribute<Prod, Date> lastUpdateTime;
	public static volatile SingularAttribute<Prod, Integer> versionstamp;
	public static volatile SetAttribute<Prod, ProdAttr> prodAttrs;
	public static volatile SetAttribute<Prod, OrderDetail> orderDetails;
}
