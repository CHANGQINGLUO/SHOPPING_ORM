package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.163+0800")
@StaticMetamodel(Brand.class)
public class Brand_ {
	public static volatile SingularAttribute<Brand, String> id;
	public static volatile SingularAttribute<Brand, String> brandCode;
	public static volatile SingularAttribute<Brand, String> brandName;
	public static volatile SingularAttribute<Brand, String> lastUpdateBy;
	public static volatile SingularAttribute<Brand, Date> lastUpdateTime;
	public static volatile SingularAttribute<Brand, Integer> versionstamp;
	public static volatile SetAttribute<Brand, Prod> prods;
}
