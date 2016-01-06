package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.170+0800")
@StaticMetamodel(CateAttrSet.class)
public class CateAttrSet_ {
	public static volatile SingularAttribute<CateAttrSet, String> id;
	public static volatile SingularAttribute<CateAttrSet, Attr> attr;
	public static volatile SingularAttribute<CateAttrSet, String> cateAttrSetCode;
	public static volatile SingularAttribute<CateAttrSet, Boolean> isMandatory;
	public static volatile SingularAttribute<CateAttrSet, String> lastUpdateBy;
	public static volatile SingularAttribute<CateAttrSet, Date> lastUpdateTime;
	public static volatile SingularAttribute<CateAttrSet, Integer> versionstamp;
	public static volatile SetAttribute<CateAttrSet, Cate> cates;
}
