package ru.alazarev.sbertest.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Class Services
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
@JacksonXmlRootElement(localName = "services")
public class Services {
    @JacksonXmlProperty(localName = "serv")
    private Serv serv;

    public Serv getServ() {
        return serv;
    }
}
