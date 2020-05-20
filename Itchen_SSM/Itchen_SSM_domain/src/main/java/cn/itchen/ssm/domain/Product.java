package cn.itchen.ssm.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品信息
 */
public class Product implements Serializable {
    private String id;
    private String productnum;
    private String productname;
    private String cityname;
    private Date departuretime;
    private String departuretimestr;
    private Double productprice;
    private String productdesc;
    private Integer productstatus;
    private String productstatusstr;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productnum='" + productnum + '\'' +
                ", productname='" + productname + '\'' +
                ", cityname='" + cityname + '\'' +
                ", departuretime=" + departuretime +
                ", departuretimestr='" + departuretimestr + '\'' +
                ", productprice=" + productprice +
                ", productdesc='" + productdesc + '\'' +
                ", productstatus=" + productstatus +
                ", productstatusstr='" + productstatusstr + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductnum() {
        return productnum;
    }

    public void setProductnum(String productnum) {
        this.productnum = productnum;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public String getDeparturetimestr() {
        return departuretimestr;
    }

    public void setDeparturetimestr(String departuretimestr) {
        this.departuretimestr = departuretimestr;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    public String getProductstatusstr() {
        return productstatusstr;
    }

    public void setProductstatusstr(String productstatusstr) {
        this.productstatusstr = productstatusstr;
    }


}
