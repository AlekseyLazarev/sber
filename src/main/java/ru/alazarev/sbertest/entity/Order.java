package ru.alazarev.sbertest.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Class Order
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
@JacksonXmlRootElement
public class Order {
    @JacksonXmlProperty(localName = "services")
    private Services services;
    @JacksonXmlProperty(localName = "summa")
    private double sum;

    public Services getServices() {
        return services;
    }

    public double getSum() {
        return sum;
    }
}
