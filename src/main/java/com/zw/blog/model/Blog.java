package com.zw.blog.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author gan zw
 * @date 2018/4/9 0009
 */
@Alias("blog")
@Table(name = "base_blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;   // 标题

    private String content; //富文本

    private String textcontent; //纯文本

    private String label; //标签，用逗号分隔

    private Integer viewnum; //浏览量

    private Integer likenum; //点赞量

    private Integer reviewnum; //评论数

    private Long createtime;

    private String creator;

    private Long updatetime;

    private String updater;

    private String creatorname; // 创建者名称

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTextcontent() {
        return textcontent;
    }

    public void setTextcontent(String textcontent) {
        this.textcontent = textcontent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getViewnum() {
        return viewnum;
    }

    public void setViewnum(Integer viewnum) {
        this.viewnum = viewnum;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Integer getReviewnum() {
        return reviewnum;
    }

    public void setReviewnum(Integer reviewnum) {
        this.reviewnum = reviewnum;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("content", content)
                .append("textcontent", textcontent)
                .append("label", label)
                .append("viewnum", viewnum)
                .append("likenum", likenum)
                .append("reviewnum", reviewnum)
                .append("createtime", createtime)
                .append("creator", creator)
                .append("updatetime", updatetime)
                .append("updater", updater)
                .append("creatorname", creatorname)
                .toString();
    }
}
