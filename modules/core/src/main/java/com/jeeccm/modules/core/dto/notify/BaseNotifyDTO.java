package com.jeeccm.modules.core.dto.notify;
/**
 * 类名：BaseNotifyDTO.java<br>
 * 描述：基于分布式消息通知基础类<br>
 * 创建者：XINJF<br>
 * 创建日期：2018年4月25日 上午11:26:28<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
public class BaseNotifyDTO {

	/**
	 * 消息通知类型
	 */
	private Integer notifyType;
	
	public BaseNotifyDTO(){
		super();
	}

	public BaseNotifyDTO(Integer notifyType){
		super();
		this.notifyType = notifyType;
	} 
	public int getNotifyType() {
		return notifyType;
	}

	public void setNotifyType(int notifyType) {
		this.notifyType = notifyType;
	}

}
