package com.pluton.veterianaria.domain;

public class ClientDomain {

    private int clientId;
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

    public DistrictDomain getDistrict() {
        return districtDomain;
    }

    public void setDistrict(DistrictDomain districtDomain) {
        this.districtDomain = districtDomain;
    }
}
