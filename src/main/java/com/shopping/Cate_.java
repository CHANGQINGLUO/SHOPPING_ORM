package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.167+0800")
@StaticMetamodel(Cate.class)
public class Cate_ {
	public static volatile SingularAttribute<Cate, String> id;
	public static volatile SingularAttribute<Cate, CateAttrSet> cateAttrSet;
	public static volatile SingularAttribute<Cate, String> cateCode;
	public static volatile SingularAttribute<Cate, String> cateName;
	public static volatile SingularAttribute<Cate, String> createdBy;
	public static volatile SingularAttribute<Cate, Date> createdTime;
	public static volatile SingularAttribute<Cate, Boolean> isactive;
	public static volatile SingularAttribute<Cate, String> lastUpdateBy;
	public static volatile SingularAttribute<Cate, Date> lastUpdateTime;
	public static volatile SingularAttribute<Cate, Integer> versionstamp;
	public static volatile SetAttribute<Cate, CateCate> cateCatesForCateIdChild;
	public static volatile SetAttribute<Cate, CateCate> cateCatesForCateIdParent;
	public static volatile SetAttribute<Cate, Prod> prods;
}
