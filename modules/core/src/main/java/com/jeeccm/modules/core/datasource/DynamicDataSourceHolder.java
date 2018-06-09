package com.jeeccm.modules.core.datasource;

/**
 * 类名：DynamicDataSourceHolder.java<br>
 * 描述：线程安全设置动态数据源<br>
 * 创建者：XINJF<br>
 * 创建日期：2018年3月1日 上午9:19:07<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
public class DynamicDataSourceHolder {

	public static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<DataSourceType>();  
	  
    public static void putDataSource(DataSourceType dataSourceType) {  
    	contextHolder.set(dataSourceType);  
    }  
  
    public static DataSourceType getDataSourceType(){
		return contextHolder.get();
	}
	
	public static void clearDataSourceType(){
		contextHolder.remove();
	}
	
}
