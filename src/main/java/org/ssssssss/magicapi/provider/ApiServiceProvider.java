package org.ssssssss.magicapi.provider;

import org.ssssssss.magicapi.config.ApiInfo;

import java.util.List;

public interface ApiServiceProvider {
	/**
	 * 删除接口
	 *
	 * @param id
	 * @return
	 */
	boolean delete(String id);

	/**
	 * 根据组名删除接口
	 *
	 * @param groupName
	 * @return
	 */
	boolean deleteGroup(String groupName);

	/**
	 * 查询所有接口（提供给页面,无需带script）
	 *
	 * @return
	 */
	List<ApiInfo> list();

	/**
	 * 查询所有接口（内部使用，需要带Script）
	 *
	 * @return
	 */
	List<ApiInfo> listWithScript();

	/**
	 * 查询接口详情（主要给页面使用）
	 *
	 * @param id
	 * @return
	 */
	ApiInfo get(String id);

	/**
	 * 判断接口是否存在
	 *
	 * @param method 请求方法
	 * @param path   请求路径
	 * @return
	 */
	boolean exists(String method, String path);

	/**
	 * 判断接口是否存在
	 *
	 * @param method 请求方法
	 * @param path   请求路径
	 * @param id     排除接口
	 * @return
	 */
	boolean existsWithoutId(String method, String path, String id);

	/**
	 * 添加接口信息
	 *
	 * @param info
	 * @return
	 */
	boolean insert(ApiInfo info);

	/**
	 * 修改接口信息
	 *
	 * @param info
	 * @return
	 */
	boolean update(ApiInfo info);

	/**
	 * 包装接口信息（可用于加密）
	 *
	 * @param info
	 */
	default void wrap(ApiInfo info) {
	}

	/**
	 * 解除包装接口信息（可用于解密）
	 *
	 * @param info
	 */
	default void unwrap(ApiInfo info) {
	}
}
