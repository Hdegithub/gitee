package com.newstest.service;

import com.newstest.domain.Link;
import com.newstest.utils.PageQueryUtil;
import com.newstest.utils.PageResult;

import java.util.List;
import java.util.Map;

public interface LinkService {
    /**
     * 查询友链的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    int getTotalLinks();

    Boolean saveLink(Link link);

    Link selectById(Integer id);

    Boolean updateLink(Link tempLink);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回友链页面所需的所有数据
     *
     * @return
     */
    Map<Byte, List<Link>> getLinksForLinkPage();
}
