package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.177+0800")
@StaticMetamodel(Consumer.class)
public class Consumer_ {
	public static volatile SingularAttribute<Consumer, String> id;
	public static volatile SingularAttribute<Consumer, User> user;
	public static volatile SingularAttribute<Consumer, String> lastUpdateBy;
	public static volatile SingularAttribute<Consumer, Date> lastUpdateTime;
	public static volatile SingularAttribute<Consumer, Integer> versionstamp;
}
