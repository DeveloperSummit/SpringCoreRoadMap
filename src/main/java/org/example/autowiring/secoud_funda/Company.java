package org.example.autowiring.secoud_funda;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {

    private String companyName;
    @Autowired
    private Product product;

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", product=" + product +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
