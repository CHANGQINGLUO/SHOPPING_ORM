package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.174+0800")
@StaticMetamodel(CateCate.class)
public class CateCate_ {
	public static volatile SingularAttribute<CateCate, String> id;
	public static volatile SingularAttribute<CateCate, Cate> cateByCateIdChild;
	public static volatile SingularAttribute<CateCate, Cate> cateByCateIdParent;
	public static volatile SingularAttribute<CateCate, String> lastUpdateBy;
	public static volatile SingularAttribute<CateCate, Date> lastUpdateTime;
	public static volatile SingularAttribute<CateCate, Integer> versionstamp;
}
