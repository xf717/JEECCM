package com.jeeccm.modules.core.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.jdbc.datasource.lookup.DataSourceLookup;

import java.util.Map;

/**
 * 类名：DynamicDataSource.java<br>
 * 描述：动态数据源 路由<br>
 * 创建者：XINJF<br>
 * 创建日期：2018年3月1日 上午9:20:56<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		DataSourceType dataSourceType = DynamicDataSourceHolder.getDataSourceType();
		return dataSourceType;
	}
	
	public void setDataSourceLookup(DataSourceLookup dataSourceLookup) {
		super.setDataSourceLookup(dataSourceLookup);
	}

	
	public void setDefaultTargetDataSource(Object defaultTargetDataSource) {
		super.setDefaultTargetDataSource(defaultTargetDataSource);
	}

	
	public void setTargetDataSources(Map<Object,Object> targetDataSources) {
		super.setTargetDataSources(targetDataSources);
	}

}
