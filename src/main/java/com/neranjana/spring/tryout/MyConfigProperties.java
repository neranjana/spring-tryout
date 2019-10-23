package com.neranjana.spring.tryout;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Configuration
@ConfigurationProperties(prefix = "my.properties")
public class MyConfigProperties {

    private String first;
    private List<String> cityList;
    private Map<String, String> homeAddress;
    private Address workAddress;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    public Map<String, String> getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Map<String, String> homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyConfigProperties that = (MyConfigProperties) o;
        return Objects.equals(first, that.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first);
    }
}
