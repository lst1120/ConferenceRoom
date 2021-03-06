package com.hbu.entity;

import java.util.Date;

public class TNotice {
    private Integer id;

    private String title;

    private String authoruuid;

    private Long authorNumber;

    private String authorName;

    private Date creatTime;

    private Date updateTime;

    private Boolean isdel;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthoruuid() {
        return authoruuid;
    }

    public void setAuthoruuid(String authoruuid) {
        this.authoruuid = authoruuid == null ? null : authoruuid.trim();
    }

    public Long getAuthorNumber() {
        return authorNumber;
    }

    public void setAuthorNumber(Long authorNumber) {
        this.authorNumber = authorNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}