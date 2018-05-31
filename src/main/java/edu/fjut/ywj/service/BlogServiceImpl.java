package edu.fjut.ywj.service;

import edu.fjut.ywj.dao.Blog;
import edu.fjut.ywj.dao.BlogView;
import edu.fjut.ywj.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.service.BlogServiceImpl
 * Date: Created in 2018/5/15 1:48
 */
@Service
public class BlogServiceImpl implements BlogService {

    SqlSession sqlSession=MybatisUtil.getSqlSession();

    final String SQL="edu.fjut.ywj.mapper.BlogMapper";

    public BlogServiceImpl() throws Exception {
    }

    @Override
    public Boolean addBlog(Blog blog) {
        Integer i=sqlSession.insert(SQL+".addBlog",blog);
        if(i>0){
            sqlSession.commit();
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Blog> selectBlogAll() {

        List<Blog> blogs=sqlSession.selectList(SQL+".selectBlogAll");
            return blogs;
    }

    @Override
    public Blog selectBlogById(Integer id) {
        Blog blog=sqlSession.selectOne(SQL+".selectBlogById");
        return blog;
    }

    @Override
    public BlogView selectBlogViewById(Integer id) {

        BlogView blogView=sqlSession.selectOne(SQL+".selectBlogViewById",id);
        return blogView;
    }
}
