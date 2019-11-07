package com.boot.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: raymon
 * @description: 文章Dao层
 * @date: 2017/10/24 16:06
 */
@Component
@Mapper
public interface ArticleDao {
    /**
     * 新增文章
     *
     * @param jsonObject
     * @return
     */
    int addArticle(JSONObject jsonObject);

    /**
     * 统计文章总数
     *
     * @param jsonObject
     * @return
     */
    int countArticle(JSONObject jsonObject);

    /**
     * 文章列表
     *
     * @param jsonObject
     * @return
     */
    List<JSONObject> listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     *
     * @param jsonObject
     * @return
     */
    int updateArticle(JSONObject jsonObject);
}
