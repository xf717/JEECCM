package com.jeeccm.modules.core.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类名：DataSource.java<br>
 * 描述：多数据源使用注解<br>
 * 创建者：XINJF<br>
 * 创建日期：2018年3月1日 上午9:14:08<br>
 * 版本：1.0<br>
 * 修改者：<br>
 * 修改日期：<br>
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
public @interface DataSource {
	
	DataSourceType value() default DataSourceType.MASTER; //默认主库

}
