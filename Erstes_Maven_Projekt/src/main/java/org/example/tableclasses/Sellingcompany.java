package org.example.tableclasses;

import jakarta.persistence.*;


@Entity
@Table(name="selling_companys")
public class Sellingcompany {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sellingcompanyid")
    private int sellingcompanyid;

    @Column(name = "companyname")
    private String companyname;

    @Column(name = "address")
    private String address;

    @Column(name = "plz")
    private String plz;

    @Column(name = "nameofcontact")
    private String nameofcontact;

    @Column(name = "emailofcontact")
    private String emailofcontact;


    @Column(name = "phonenumber")
    private String phonenumber;


    @Column(name = "saldo")
    private String saldo;



    public Sellingcompany() {}

    public Sellingcompany(String companyname, String address, String phonenumber,String plz, String nameofcontact, String emailofcontact, String saldo) {
        this.companyname = companyname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.plz = plz;
        this.nameofcontact = nameofcontact;
        this.emailofcontact = emailofcontact;
        this.saldo = saldo;
    }

    public int getSellingcompanyid() {
        return sellingcompanyid;
    }
    public void setSellingcompanyid(int sellingcompanyid) {
        this.sellingcompanyid = sellingcompanyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlz() {
        return plz;
    }
    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getNameofcontact() {
        return nameofcontact;
    }
    public void setNameofcontact(String nameofcontact) {
        this.nameofcontact = nameofcontact;
    }
    public String getEmailofcontact() {
        return emailofcontact;
    }
    public void setEmailofcontact(String emailofcontact) {
        this.emailofcontact = emailofcontact;
    }
    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

}
