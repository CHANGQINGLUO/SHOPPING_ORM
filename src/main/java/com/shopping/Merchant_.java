package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.181+0800")
@StaticMetamodel(Merchant.class)
public class Merchant_ {
	public static volatile SingularAttribute<Merchant, String> id;
	public static volatile SingularAttribute<Merchant, User> user;
	public static volatile SingularAttribute<Merchant, String> lastUpdateBy;
	public static volatile SingularAttribute<Merchant, Date> lastUpdateTime;
	public static volatile SingularAttribute<Merchant, Integer> versionstamp;
}
