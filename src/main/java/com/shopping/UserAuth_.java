package com.shopping;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-06T15:15:58.204+0800")
@StaticMetamodel(UserAuth.class)
public class UserAuth_ {
	public static volatile SingularAttribute<UserAuth, String> id;
	public static volatile SingularAttribute<UserAuth, User> user;
	public static volatile SingularAttribute<UserAuth, String> password;
	public static volatile SingularAttribute<UserAuth, Date> createTime;
	public static volatile SingularAttribute<UserAuth, Boolean> isLogin;
	public static volatile SingularAttribute<UserAuth, Boolean> isLocked;
	public static volatile SingularAttribute<UserAuth, Integer> failedTimes;
	public static volatile SingularAttribute<UserAuth, Date> lastLoginTime;
	public static volatile SingularAttribute<UserAuth, String> lastUpdateBy;
	public static volatile SingularAttribute<UserAuth, Date> lastUpdateTime;
	public static volatile SingularAttribute<UserAuth, Integer> versionstamp;
}
