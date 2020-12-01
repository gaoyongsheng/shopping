package com.shopping.demo.entity;


import com.shopping.demo.constants.DaoConstant;
import com.shopping.demo.dto.AddressDto;
import com.shopping.demo.entity.base.BaseModel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = DaoConstant.ADDRESS_TABLE_NAME)
@Data
public class Address extends BaseModel<AddressDto> {

    @Column()
    private String addrUser;

    @Column()
    private String addrMobile;

    @Column()
    private String addrProvince;

    @Column()
    private String addrCity;

    @Column()
    private String addrCounty;

    @Column()
    private String addrDetail;

    @Column()
    private Long addrUserForeignId;


    public Address(){}

    public Address(AddressDto addressDto){
        this.id = addressDto.getId();
        this.addrUser = addressDto.getAddrUser();
        this.addrMobile = addressDto.getAddrMobile();
        this.addrProvince = addressDto.getAddrProvince();
        this.addrCity = addressDto.getAddrCity();
        this.addrCounty = addressDto.getAddrCounty();
        this.addrDetail = addressDto.getAddrDetail();
    }

    @Override
    public AddressDto toDto() {
        AddressDto addressDto = new AddressDto();
        addressDto.setId(id);
        addressDto.setAddrUser(addrUser);
        addressDto.setAddrMobile(addrMobile);
        addressDto.setAddrProvince(addrProvince);
        addressDto.setAddrCity(addrCity);
        addressDto.setAddrCounty(addrCounty);
        addressDto.setAddrDetail(addrDetail);
        return addressDto;
    }


    @Override
    public String toString() {
        return "Address{" +
                "id='" + id +
                ",addrUser='" + addrUser +
                ", addrMobile='" + addrMobile +
                ", addrProvince='" + addrProvince +
                ", addrCity='" + addrCity +
                ", addrCounty='" + addrCounty +
                ", addrDetail='" + addrDetail +
                '}';
    }
}
