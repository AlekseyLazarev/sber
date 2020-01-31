package ru.alazarev.sbertest.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * Class Serv
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
@JacksonXmlRootElement(localName = "serv")
public class Serv {
    @JacksonXmlProperty(localName = "isClosed")
    private byte isClosed;
    @JacksonXmlProperty(localName = "serv_id")
    private String serv_id;
    @JacksonXmlProperty(localName = "bic")
    private int bic;
    @JacksonXmlProperty(localName = "schet")
    private String schet;
    @JacksonXmlProperty(localName = "corr_schet")
    private long corr_schet;
    @JacksonXmlProperty(localName = "pars")
    private List<Par> pars;
    @JacksonXmlProperty(localName = "sys_message")
    private String sys_message;

    public byte getIsClosed() {
        return isClosed;
    }

    public String getServ_id() {
        return serv_id;
    }

    public int getBic() {
        return bic;
    }

    public String getSchet() {
        return schet;
    }

    public long getCorr_schet() {
        return corr_schet;
    }

    public List<Par> getPars() {
        return pars;
    }

    public String getSys_message() {
        return sys_message;
    }
}
