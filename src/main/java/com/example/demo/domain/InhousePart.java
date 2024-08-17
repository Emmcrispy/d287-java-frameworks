package com.example.demo.domain;

import com.example.demo.validators.ValidInventory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
@ValidInventory
public class InhousePart extends Part {

    int partId;

    public InhousePart() {
        this.minimum = 1;
        this.maximum = 100;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

}
