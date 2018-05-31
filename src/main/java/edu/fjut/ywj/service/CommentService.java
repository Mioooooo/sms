package edu.fjut.ywj.service;

import edu.fjut.ywj.dao.Comment;
import edu.fjut.ywj.dao.CommentView;

import java.util.List;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.service.CommentService
 * Date: Created in 2018/5/17 8:11
 */

public interface CommentService {

    List<Comment> selectCommentAll();

    List<CommentView>  selectCommentById(Integer id);
}
