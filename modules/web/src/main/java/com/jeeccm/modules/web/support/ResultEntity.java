package com.jeeccm.modules.web.support;

/**
 * 类名：ResultEntity.java<br>
 * 描述：使用建造器构建接口返回的实体对象<br>
 * 创建者：XINJF<br>
 * 创建日期：2018年4月11日 上午11:55:57<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
public class ResultEntity extends Result implements java.io.Serializable {

	private static final long serialVersionUID = -6410361148801997632L;
	
//	private String message;
	
	private Object data;
	
	public ResultEntity(ResultBuilder builder) {
		this.setFlag(builder.flag);
//		this.message = builder.message;
		this.data = builder.data;
	}
	
//	public String getMessage() {
//		return message;
//	}
	
	public Object getData() {
		return data;
	}

	public static class ResultBuilder implements Builder<ResultEntity> {
		
		private int flag;
//		private String message;
		private Object data; 
		
		public ResultBuilder(int flag) {
			this.flag = flag;
		}
		
//		public ResultBuilder message(final String message) {
//			this.message = message;
//			return this;
//		}
		
		public ResultBuilder data(final Object data) {
			this.data = data;
			return this;
		} 

		@Override
		public ResultEntity builder() {
			return new ResultEntity(this);
		}
		
	}
	
	
	

}
