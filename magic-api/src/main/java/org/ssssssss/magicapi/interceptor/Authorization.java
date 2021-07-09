package org.ssssssss.magicapi.interceptor;

public enum Authorization {
	/**
	 * 无实际意义
	 */
	NONE,
	/**
	 * 执行保存动作
	 */
	SAVE,
	/**
	 * 执行查看详情、列表动作
	 */
	VIEW,
	/**
	 * 执行删除动作
	 */
	DELETE,
	/**
	 * 执行导出动作
	 */
	DOWNLOAD,
	/**
	 * 执行上传动作
	 */
	UPLOAD,
	/**
	 * 执行推送动作
	 */
	PUSH
}