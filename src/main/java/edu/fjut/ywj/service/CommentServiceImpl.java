package edu.fjut.ywj.service;

import edu.fjut.ywj.dao.Comment;
import edu.fjut.ywj.dao.CommentView;
import edu.fjut.ywj.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.service.CommentServiceImpl
 * Date: Created in 2018/5/17 8:11
 */
@Service
public class CommentServiceImpl implements CommentService{

    private SqlSession sqlSession=MybatisUtil.getSqlSession();

    final String SQL="edu.fjut.ywj.mapper.CommentMapper";


    public CommentServiceImpl() throws Exception {
    }

    @Override
    public List<Comment> selectCommentAll() {
        List<Comment> comments=sqlSession.selectList(SQL+".selectCommentAll");
        return comments;
    }

    @Override
    public List<CommentView> selectCommentById(Integer id) {
        List<CommentView> commentViews=sqlSession.selectList(SQL+".selectCommentById",id);
        return commentViews;
    }
}
