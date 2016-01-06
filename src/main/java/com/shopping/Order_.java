package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.185+0800")
@StaticMetamodel(Order.class)
public class Order_ {
	public static volatile SingularAttribute<Order, String> id;
	public static volatile SingularAttribute<Order, User> userByMerchantUserId;
	public static volatile SingularAttribute<Order, User> userByConsumerUserId;
	public static volatile SingularAttribute<Order, String> orderCode;
	public static volatile SingularAttribute<Order, String> status;
	public static volatile SingularAttribute<Order, String> shippingAddr;
	public static volatile SingularAttribute<Order, String> billingAddr;
	public static volatile SingularAttribute<Order, String> lastUpdateBy;
	public static volatile SingularAttribute<Order, Date> lastUpdateTime;
	public static volatile SingularAttribute<Order, String> versionstamp;
	public static volatile SetAttribute<Order, OrderDetail> orderDetails;
}
