package com.shopping;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.189+0800")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ {
	public static volatile SingularAttribute<OrderDetail, String> id;
	public static volatile SingularAttribute<OrderDetail, Order> order;
	public static volatile SingularAttribute<OrderDetail, Prod> prod;
	public static volatile SingularAttribute<OrderDetail, BigDecimal> unitPrice;
	public static volatile SingularAttribute<OrderDetail, Integer> items;
	public static volatile SingularAttribute<OrderDetail, String> lastUpdateBy;
	public static volatile SingularAttribute<OrderDetail, Date> lastUpdateTime;
	public static volatile SingularAttribute<OrderDetail, Integer> versionstamp;
}
