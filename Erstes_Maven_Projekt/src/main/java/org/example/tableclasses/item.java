package org.example.tableclasses;

import jakarta.persistence.*;


@Entity
@Table(name="item_list")
public class item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemID")
    private int itemID;

    @Column(name = "itemname")
    private String itemname;

    @Column(name = "companyoforiginID")
    private String companyoforiginID;

    @Column(name = "itemprice")
    private String itemprice;

    @Column(name = "bestand")
    private String bestand;

    @Column(name = "mindestbestand")
    private String mindestbestand;

    @Column(name = "maximalbestand")
    private String maximalbestand;


    public item() {}

    public item (String itemname, String companyoforiginID, String itemprice, String bestand, String mindestbestand, String maximalbestand) {
        this.itemname = itemname;
        this.companyoforiginID = companyoforiginID;
        this.itemprice = itemprice;
        this.bestand = bestand;
        this.mindestbestand = mindestbestand;
        this.maximalbestand = maximalbestand;
    }

    public int getItemID() {
        return itemID;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getCompanyoforiginID() {
        return companyoforiginID;
    }

    public void setCompanyoforiginID(String companyoforiginID) {
        this.companyoforiginID = companyoforiginID;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }
    public String getBestand() {
        return bestand;
    }
    public void setBestand(String bestand) {
        this.bestand = bestand;
    }
    public String getMindestbestand() {
        return mindestbestand;
    }

    public void setMindestbestand(String mindestbestand) {
        this.mindestbestand = mindestbestand;
    }
    public String getMaximalbestand() {
        return maximalbestand;
    }
    public void setMaximalbestand(String maximalbestand) {
        this.maximalbestand = maximalbestand;
    }
}
