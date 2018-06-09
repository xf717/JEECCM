package com.jeeccm.modules.core.dto.notify;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

/**
 * 类名：NotifyRecordDto.java <br>
 * 描述：用户数据传输<br>
 * 创建者：XINJF<br>
 * 创建日期：<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
public class NotifyRecordDto {

	public static final int DEFAULT_LIMITNOTIFYTIMES = 5; // 默认限制通知次数
	public static final int DEFAULT_NOTIFYTIMES = 0;// 默认的通知次数为0
	public static final int DEFAULT_VERSION = 0; // 默认版本
	private Integer notifyId;// 消息ID
	private Integer version = 0;// VERSION
	private Integer notifyTimes = 0;// 通知次数
	private Integer limitNotifyTimes;// 限制通知次数
	private String url;// 通知URL
	private Integer busiid;// 业务ID
	private Integer status;// 通知状态(100:成功:101:未成功,默认101)
	private Integer notifyType;// 通知类型
	private String content;// 消息内容
	private String merchantNo;// 商户编号
	private String merchantOrderNo;// 商户订单号
	private Date createTime;// 创建时间
	private Date lastNotifyTime;// 最后一次通知时间

	public NotifyRecordDto(Builder builder) {
		super();
		this.notifyId = builder.notifyId;
		this.version = builder.version;// VERSION
		this.notifyTimes = builder.notifyTimes;// 通知次数
		this.limitNotifyTimes = builder.limitNotifyTimes;// 限制通知次数
		this.url = builder.url;// 通知URL
		this.busiid = builder.busiid;// 业务ID
		this.status = builder.status;// 通知状态(100:成功:101:未成功,默认101)
		this.notifyType = builder.notifyType;// 通知类型
		this.content = builder.content;// 消息内容
		this.merchantNo = builder.merchantNo;
		this.merchantOrderNo = builder.merchantOrderNo;
		this.createTime = builder.createTime;// 创建时间
		this.lastNotifyTime = builder.lastNotifyTime;// 最后一次通知时间
	}

	/**
	 * 超过四个参数以上需要set的参数使用建造器代替 默认的set 写法，如：notifyRecordDto.setVersion(0)
	 *
	 * @author XINJF
	 *
	 */
	public static class Builder {
		// 默认值
		private Integer version;// VERSION
		private Integer notifyTimes;// 通知次数
		private Integer limitNotifyTimes;// 限制通知次数
		private Integer status;// 通知状态(100:成功:101:未成功,默认101)
		private Date createTime;// 创建时间

		// 动态值,必须传的参数
		private Integer notifyType;// 通知类型
		private String content;// 消息内容
		private String merchantNo;// 商户编号
		private String merchantOrderNo;// 商户订单号
		private String url;// 通知URL

		// 可能会存在需要的参数
		private Integer notifyId;// 消息ID
		private Integer busiid;// 业务ID
		private Date lastNotifyTime;

		public Builder(final Integer notifyType, final String content,final String merchantNo,final String merchantOrderNo) {
			this.version = NotifyRecordDto.DEFAULT_VERSION;
			this.notifyTimes = NotifyRecordDto.DEFAULT_NOTIFYTIMES;
			this.limitNotifyTimes = NotifyRecordDto.DEFAULT_LIMITNOTIFYTIMES;
//			this.status = NotifyStatusEnum.FAILED.getValue(); // 默认未通知状态101
			this.createTime = new Date();
			this.notifyType = notifyType;
			this.content = content;
			this.merchantNo = merchantNo;
			this.merchantOrderNo = merchantOrderNo;
		}

		public Builder url(final String url) {
			this.url = url;
			return this;
		}

		public Builder notifyId(final Integer notifyId) {
			this.notifyId = notifyId;
			return this;
		}

		public Builder busiid(final Integer busiid) {
			this.busiid = busiid;
			return this;
		}

		public Builder lastNotifyTime(final Date lastNotifyTime) {
			this.lastNotifyTime = lastNotifyTime;
			return this;
		}

		public NotifyRecordDto build() {
			return new NotifyRecordDto(this);
		}

	}

	public Integer getNotifyId() {
		return notifyId;
	}

	public Integer getVersion() {
		return version;
	}

	public Integer getNotifyTimes() {
		return notifyTimes;
	}

	public Integer getLimitNotifyTimes() {
		return limitNotifyTimes;
	}

	public String getUrl() {
		return url;
	}

	public Integer getBusiid() {
		return busiid;
	}

	public Integer getStatus() {
		return status;
	}

	public Integer getNotifyType() {
		return notifyType;
	}

	public String getContent() {
		return content;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public String getMerchantOrderNo() {
		return merchantOrderNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Date getLastNotifyTime() {
		return lastNotifyTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}