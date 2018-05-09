package com.atrachel.model;

/**
 * Created by hd48552 on 2018/5/8.
 */
public class Zone {
    private  Integer id;
    private  String zoneName;
    private  String zoneArea;

    public void setId(Integer id ){
        this.id=id;
    }

    public Integer getId(){
        return  id;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public void setZoneArea(String zoneArea) {
        this.zoneArea = zoneArea;
    }

    public String getZoneName() {
        return zoneName;
    }

    public String getZoneArea() {
        return zoneArea;
    }

    public  Zone(){
        //todo
    }

    public  Zone(Integer id,String zoneName,String zoneArea){
        this.id=id;
        this.zoneName=zoneName;
        this.zoneArea=zoneArea;
    }

    @Override
    public  String toString(){
        return  ("id = "+id+"zoneName = "+zoneName+"zoneArea = "+zoneArea);
    }
}
