package com.igeekhome.colloa.domain;

public class DepartmentInfo {
    private Long id;

    private String companyCode;

    private String depaCode;

    private String directorCode;

    private String depaName;

    private String depaDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getDepaCode() {
        return depaCode;
    }

    public void setDepaCode(String depaCode) {
        this.depaCode = depaCode == null ? null : depaCode.trim();
    }

    public String getDirectorCode() {
        return directorCode;
    }

    public void setDirectorCode(String directorCode) {
        this.directorCode = directorCode == null ? null : directorCode.trim();
    }

    public String getDepaName() {
        return depaName;
    }

    public void setDepaName(String depaName) {
        this.depaName = depaName == null ? null : depaName.trim();
    }

    public String getDepaDesc() {
        return depaDesc;
    }

    public void setDepaDesc(String depaDesc) {
        this.depaDesc = depaDesc == null ? null : depaDesc.trim();
    }
}