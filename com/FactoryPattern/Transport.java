package com.spring.systemdesign.FactoryPattern;

public interface Transport {
    /**
     * This interface will define all the methods to be incorporated by the transport classes
     */

    public String getType();
    public Integer getTime();
    public Integer getCost();


}
