package com.newstest.service.impl;

import com.newstest.domain.Link;
import com.newstest.mapper.LinkMapper;
import com.newstest.service.LinkService;
import com.newstest.utils.PageQueryUtil;
import com.newstest.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LinkServicelmpl implements LinkService {
    @Autowired
    private LinkMapper newsLinkMapper;

    @Override
    public PageResult getBlogLinkPage(PageQueryUtil pageUtil) {
        return null;
    }

    @Override
    public int getTotalLinks() {
        return newsLinkMapper.getTotalLinks(null);
    }

    @Override
    public Boolean saveLink(Link link) {
        return null;
    }

    @Override
    public Link selectById(Integer id) {
        return null;
    }

    @Override
    public Boolean updateLink(Link tempLink) {
        return null;
    }

    @Override
    public Boolean deleteBatch(Integer[] ids) {
        return null;
    }

    @Override
    public Map<Byte, List<Link>> getLinksForLinkPage() {
        return null;
    }
}
