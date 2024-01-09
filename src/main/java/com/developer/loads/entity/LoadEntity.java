package com.developer.loads.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mt_load")
public class LoadEntity {

    @Id
    @Column(name = "shipper_id")
    private long shipperId;
    @Column(name = "load_point")
    private String loadingPoint;
    @Column(name = "unload_point")
    private String unloadingPoint;
    @Column(name = "prod_type")
    private String productType;
    @Column(name = "truck_type")
    private String truckType;
    @Column(name = "no_truck")
    private int noOfTrucks;
    @Column(name = "weight")
    private int weight;
    @Column(name = "optional")
    private String optional;
    @Column(name = "date")
    private String Date;

    public LoadEntity(Long shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String optional, String date) {
        this.shipperId = shipperId;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.optional = optional;
        this.Date = date;
    }

    public LoadEntity() {
    }

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}
