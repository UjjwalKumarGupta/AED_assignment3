/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;




/**
 *
 * @author DELL
 */
public class Product {
    
    private String Name;
    private String Address;
    private String dob;
    private long telephone;
    private long fax;
    private String email;
    private String ssn;
    private long medNo;
    private long healthNo;
    private long bankNo;
    private long licenseNo;
    private String vehicleNo;
    private long deviceNo;
    private String linkedIn;
    private String ipAddress;
    private File pic;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        
        this.Name = Name;
        
        }
        
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public long getFax() {
        return fax;
    }

    public void setFax(long fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public long getMedNo() {
        return medNo;
    }

    public void setMedNo(long medNo) {
        this.medNo = medNo;
    }

    public long getHealthNo() {
        return healthNo;
    }

    public void setHealthNo(long healthNo) {
        this.healthNo = healthNo;
    }

    public long getBankNo() {
        return bankNo;
    }

    public void setBankNo(long bankNo) {
        this.bankNo = bankNo;
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(long licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public long getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(long deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public File getPic() {
        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    
    
    
    
    
    
    
}
