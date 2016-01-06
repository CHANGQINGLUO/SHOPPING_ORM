package com.shopping;

// Generated Jan 6, 2016 3:15:55 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Cate generated by hbm2java
 */
@Entity
@Table(name = "cate", catalog = "shdb", uniqueConstraints = @UniqueConstraint(columnNames = "cate_code"))
public class Cate implements java.io.Serializable {

	private String id;
	private CateAttrSet cateAttrSet;
	private String cateCode;
	private String cateName;
	private String createdBy;
	private Date createdTime;
	private boolean isactive;
	private String lastUpdateBy;
	private Date lastUpdateTime;
	private Integer versionstamp;
	private Set<CateCate> cateCatesForCateIdChild = new HashSet<CateCate>(0);
	private Set<CateCate> cateCatesForCateIdParent = new HashSet<CateCate>(0);
	private Set<Prod> prods = new HashSet<Prod>(0);

	public Cate() {
	}

	public Cate(String id, CateAttrSet cateAttrSet, String cateCode,
			String cateName, String createdBy, Date createdTime,
			boolean isactive) {
		this.id = id;
		this.cateAttrSet = cateAttrSet;
		this.cateCode = cateCode;
		this.cateName = cateName;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.isactive = isactive;
	}

	public Cate(String id, CateAttrSet cateAttrSet, String cateCode,
			String cateName, String createdBy, Date createdTime,
			boolean isactive, String lastUpdateBy, Date lastUpdateTime,
			Integer versionstamp, Set<CateCate> cateCatesForCateIdChild,
			Set<CateCate> cateCatesForCateIdParent, Set<Prod> prods) {
		this.id = id;
		this.cateAttrSet = cateAttrSet;
		this.cateCode = cateCode;
		this.cateName = cateName;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.isactive = isactive;
		this.lastUpdateBy = lastUpdateBy;
		this.lastUpdateTime = lastUpdateTime;
		this.versionstamp = versionstamp;
		this.cateCatesForCateIdChild = cateCatesForCateIdChild;
		this.cateCatesForCateIdParent = cateCatesForCateIdParent;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cate_attr_set_id", nullable = false)
	public CateAttrSet getCateAttrSet() {
		return this.cateAttrSet;
	}

	public void setCateAttrSet(CateAttrSet cateAttrSet) {
		this.cateAttrSet = cateAttrSet;
	}

	@Column(name = "cate_code", unique = true, nullable = false, length = 12)
	public String getCateCode() {
		return this.cateCode;
	}

	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}

	@Column(name = "cate_name", nullable = false, length = 45)
	public String getCateName() {
		return this.cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	@Column(name = "created_by", nullable = false, length = 30)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_time", nullable = false, length = 19)
	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@Column(name = "isactive", nullable = false)
	public boolean isIsactive() {
		return this.isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Column(name = "last_update_by", length = 45)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cateByCateIdChild")
	public Set<CateCate> getCateCatesForCateIdChild() {
		return this.cateCatesForCateIdChild;
	}

	public void setCateCatesForCateIdChild(Set<CateCate> cateCatesForCateIdChild) {
		this.cateCatesForCateIdChild = cateCatesForCateIdChild;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cateByCateIdParent")
	public Set<CateCate> getCateCatesForCateIdParent() {
		return this.cateCatesForCateIdParent;
	}

	public void setCateCatesForCateIdParent(
			Set<CateCate> cateCatesForCateIdParent) {
		this.cateCatesForCateIdParent = cateCatesForCateIdParent;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cate")
	public Set<Prod> getProds() {
		return this.prods;
	}

	public void setProds(Set<Prod> prods) {
		this.prods = prods;
	}

}
