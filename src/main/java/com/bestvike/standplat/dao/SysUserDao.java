package com.bestvike.standplat.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao {
	/**
	 * 生成用户编号
	 *
	 * @return
	 */
	public Integer selectId();
}
