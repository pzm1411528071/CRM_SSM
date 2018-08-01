package com.ncu.pojo;
public class HouseInfo {
/* *
 * 房屋信息pojo
 * */
    private Integer houseId;//房屋信息id
    private String houseAddress;//房屋地址
    private Integer housePrice;//房屋价格
    private String houseAmbient;//房屋周围
    private String isUsed;//是否被使用   使用(1) 未使用(0)
    private Integer typeId;//房屋类型id
    private Integer userId;//用户id

    //关联
    private UserInfo ui;
    private HouseType ht;
    
    public Integer getHouseId() {
        return houseId;
    }

    public UserInfo getUi() {
		return ui;
	}

	public void setUi(UserInfo ui) {
		this.ui = ui;
	}

	public HouseType getHt() {
		return ht;
	}

	public void setHt(HouseType ht) {
		this.ht = ht;
	}

	public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    public String getHouseAmbient() {
        return houseAmbient;
    }

    public void setHouseAmbient(String houseAmbient) {
        this.houseAmbient = houseAmbient == null ? null : houseAmbient.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}