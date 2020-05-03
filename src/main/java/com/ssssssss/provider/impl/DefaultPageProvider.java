package com.ssssssss.provider.impl;

import com.ssssssss.model.Page;
import com.ssssssss.provider.PageProvider;
import org.apache.commons.lang3.math.NumberUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 分页对象默认提取接口
 */
public class DefaultPageProvider implements PageProvider {

    /**
     * page参数名
     */
    private String pageName;

    /**
     * pageSize参数名
     */
    private String pageSize;

    /**
     * 默认分页大小
     */
    private long defaultPageSize = 10;

    /**
     * 默认页数
     */
    private long defaultPage = 1;

    public DefaultPageProvider(String pageName, String pageSize) {
        this.pageName = pageName;
        this.pageSize = pageSize;
    }

    public DefaultPageProvider(String pageName, String pageSize, long defaultPageSize, long defaultPage) {
        this.pageName = pageName;
        this.pageSize = pageSize;
        this.defaultPageSize = defaultPageSize;
        this.defaultPage = defaultPage;
    }


    @Override
    public Page getPage(HttpServletRequest request) {
        // 从Request中提取page以及pageSize
        long page = NumberUtils.toLong(request.getParameter(this.pageName), this.defaultPage);
        long pageSize = NumberUtils.toLong(request.getParameter(this.pageSize), this.defaultPageSize);
        // 计算limit以及offset
        return new Page((page - 1) * pageSize, pageSize);

    }
}
