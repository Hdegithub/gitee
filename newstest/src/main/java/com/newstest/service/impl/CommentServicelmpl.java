package com.newstest.service.impl;

import com.newstest.domain.NewsComment;
import com.newstest.mapper.NewsCommentMapper;
import com.newstest.service.CommentService;
import com.newstest.utils.PageQueryUtil;
import com.newstest.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServicelmpl implements CommentService {
    @Autowired
    private NewsCommentMapper newsCommentMapper;

    @Override
    public Boolean addComment(NewsComment blogComment) {
        return null;
    }

    @Override
    public PageResult getCommentsPage(PageQueryUtil pageUtil) {
        return null;
    }

    @Override
    public int getTotalComments() {
        return newsCommentMapper.getTotalNewsComments(null);
    }

    @Override
    public Boolean checkDone(Integer[] ids) {
        return null;
    }

    @Override
    public Boolean deleteBatch(Integer[] ids) {
        return null;
    }

    @Override
    public Boolean reply(Long commentId, String replyBody) {
        return null;
    }

    @Override
    public PageResult getCommentPageByBlogIdAndPageNum(Long newsId, int page) {
        return null;
    }
}
