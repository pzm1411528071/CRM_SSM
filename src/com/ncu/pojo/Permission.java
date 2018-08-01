package com.ncu.pojo;

import java.util.List;

public class Permission {
/* *
 * 权限pojo
 * */
    private Integer pId;//权限id
    private String pName;//权限名称
    private String pSource;//权限来源
    private Byte pIsparent;
    private Integer pParentid;
    //体现层次关系 子菜单集合
    private List<Permission> psons;
    public List<Permission> getPsons() {
		return psons;
	}

	public void setPsons(List<Permission> psons) {
		this.psons = psons;
	}

	public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSource() {
        return pSource;
    }

    public void setpSource(String pSource) {
        this.pSource = pSource == null ? null : pSource.trim();
    }

    public Byte getpIsparent() {
        return pIsparent;
    }

    public void setpIsparent(Byte pIsparent) {
        this.pIsparent = pIsparent;
    }

    public Integer getpParentid() {
        return pParentid;
    }

    public void setpParentid(Integer pParentid) {
        this.pParentid = pParentid;
    }
}