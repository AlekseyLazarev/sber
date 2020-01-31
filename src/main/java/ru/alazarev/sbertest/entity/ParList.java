package ru.alazarev.sbertest.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.persistence.*;

/**
 * Class ParList
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
@Entity
@Table(schema = "sbank", name = "par_list")
@JacksonXmlRootElement(localName = "par_list")
public class ParList implements Comparable<ParList> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JacksonXmlProperty(localName = "value")
    @Column(name = "value")
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(ParList o) {
        return this.value.compareTo(o.value);
    }

    @Override
    public String toString() {
        return "ParList value = " + value;
    }
}
