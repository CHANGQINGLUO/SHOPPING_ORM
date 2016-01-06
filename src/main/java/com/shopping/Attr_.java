package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.114+0800")
@StaticMetamodel(Attr.class)
public class Attr_ {
	public static volatile SingularAttribute<Attr, String> id;
	public static volatile SingularAttribute<Attr, String> attrCode;
	public static volatile SingularAttribute<Attr, String> attrName;
	public static volatile SingularAttribute<Attr, String> attrCate;
	public static volatile SingularAttribute<Attr, String> lastUpdateBy;
	public static volatile SingularAttribute<Attr, Date> lastUpdateTime;
	public static volatile SingularAttribute<Attr, Integer> versionstamp;
	public static volatile SetAttribute<Attr, ProdAttr> prodAttrs;
	public static volatile SetAttribute<Attr, CateAttrSet> cateAttrSets;
}
