package com.bat.mengfan.redis_demo.pojo;

import java.util.Date;

public class Company {
	private Integer id;
	private String companyName;
	private Date createTime;
	private Date modifiedTime;
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", createTime=" + createTime + ", modifiedTime="
				+ modifiedTime + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
