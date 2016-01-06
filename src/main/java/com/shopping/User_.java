package com.shopping;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.200+0800")
@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, String> id;
	public static volatile SingularAttribute<User, String> userCode;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> emailId;
	public static volatile SingularAttribute<User, String> mobilePhone;
	public static volatile SetAttribute<User, Merchant> merchants;
	public static volatile SetAttribute<User, UserAuth> userAuths;
	public static volatile SetAttribute<User, Consumer> consumers;
	public static volatile SetAttribute<User, Order> ordersForMerchantUserId;
	public static volatile SetAttribute<User, Order> ordersForConsumerUserId;
}
