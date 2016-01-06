package com.shopping;

// Generated Jan 6, 2016 3:15:55 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Brand generated by hbm2java
 */
@Entity
@Table(name = "brand", catalog = "shdb", uniqueConstraints = @UniqueConstraint(columnNames = "brand_code"))
public class Brand implements java.io.Serializable {

	private String id;
	private String brandCode;
	private String brandName;
	private String lastUpdateBy;
	private Date lastUpdateTime;
	private Integer versionstamp;
	private Set<Prod> prods = new HashSet<Prod>(0);

	public Brand() {
	}

	public Brand(String id, String brandCode) {
		this.id = id;
		this.brandCode = brandCode;
	}

	public Brand(String id, String brandCode, String brandName,
			String lastUpdateBy, Date lastUpdateTime, Integer versionstamp,
			Set<Prod> prods) {
		this.id = id;
		this.brandCode = brandCode;
		this.brandName = brandName;
		this.lastUpdateBy = lastUpdateBy;
		this.lastUpdateTime = lastUpdateTime;
		this.versionstamp = versionstamp;
		this.prods = prods;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 100)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "brand_code", unique = true, nullable = false, length = 12)
	public String getBrandCode() {
		return this.brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	@Column(name = "brand_name", length = 45)
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Column(name = "last_update_by", length = 30)
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update_time", length = 19)
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "versionstamp")
	public Integer getVersionstamp() {
		return this.versionstamp;
	}

	public void setVersionstamp(Integer versionstamp) {
		this.versionstamp = versionstamp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
	public Set<Prod> getProds() {
		return this.prods;
	}

	public void setProds(Set<Prod> prods) {
		this.prods = prods;
	}

}
