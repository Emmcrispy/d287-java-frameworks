package com.example.demo.domain;

import com.example.demo.validators.ValidInventory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
@ValidInventory
public class OutsourcedPart extends Part{
String companyName;

    public OutsourcedPart() {
        this.minimum = 1;
        this.maximum = 100;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
