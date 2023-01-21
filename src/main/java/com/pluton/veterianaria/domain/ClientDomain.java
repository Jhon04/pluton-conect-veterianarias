package com.pluton.veterianaria.domain;

public class ClientDomain {

    private int clientId;

    private int districtId;

    private int userId;
    private String name;

    private String cellPhone;

    private String address;

    private DistrictDomain districtDomain;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DistrictDomain getDistrictDomain() {
        return districtDomain;
    }

    public void setDistrictDomain(DistrictDomain districtDomain) {
        this.districtDomain = districtDomain;
    }
}
