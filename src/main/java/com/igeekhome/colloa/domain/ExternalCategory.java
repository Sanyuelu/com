package com.igeekhome.colloa.domain;

public class ExternalCategory {
    private Long id;

    private String categoryCode;

    private String catetoryName;

    private String catetoryDesc;

    private Integer priority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getCatetoryName() {
        return catetoryName;
    }

    public void setCatetoryName(String catetoryName) {
        this.catetoryName = catetoryName == null ? null : catetoryName.trim();
    }

    public String getCatetoryDesc() {
        return catetoryDesc;
    }

    public void setCatetoryDesc(String catetoryDesc) {
        this.catetoryDesc = catetoryDesc == null ? null : catetoryDesc.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}