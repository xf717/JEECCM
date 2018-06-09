package com.jeeccm.modules.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 类名：BaseEntity.java <br>
 * 描述：<br>
 * 创建者：XINJF<br>
 * 创建日期：<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2896124801689612869L;

	protected Long id;

	protected Integer version = 0;
	/**
	 * 创建时间
	 */
	protected Date createTime = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
