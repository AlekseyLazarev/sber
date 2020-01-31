package ru.alazarev.sbertest.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * Class Par
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
@JacksonXmlRootElement(localName = "pars")
public class Par {
    @JacksonXmlProperty(localName = "step")
    private int step;
    @JacksonXmlProperty(localName = "name")
    private String name;
    @JacksonXmlProperty(localName = "fullname")
    private String fullName;
    @JacksonXmlProperty(localName = "comment")
    private String comment;
    @JacksonXmlProperty(localName = "isEditable")
    private byte isEditable;
    @JacksonXmlProperty(localName = "isScanable")
    private byte isScannble;
    @JacksonXmlProperty(localName = "isVisible")
    private byte isVisible;
    @JacksonXmlProperty(localName = "isRequired")
    private byte isRequired;
    @JacksonXmlProperty(localName = "isPrinted")
    private byte isPrinted;
    @JacksonXmlProperty(localName = "isValidateOnLine")
    private byte isValidateOnLine;
    @JacksonXmlProperty(localName = "type")
    private String type;
    @JacksonXmlProperty(localName = "min_length")
    private int min_length;
    @JacksonXmlProperty(localName = "max_length")
    private int max_length;
    @JacksonXmlProperty(localName = "double_input")
    private double double_input;
    @JacksonXmlProperty(localName = "value")
    private String value;
    @JacksonXmlProperty(localName = "reg_exp")
    private String reg_exp;
    @JacksonXmlProperty(localName = "from_debt")
    private long from_debt;
    @JacksonXmlProperty(localName = "par_list")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ParList> parLists;

    public int getStep() {
        return step;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getComment() {
        return comment;
    }

    public byte getIsEditable() {
        return isEditable;
    }

    public byte getIsScannble() {
        return isScannble;
    }

    public byte getIsVisible() {
        return isVisible;
    }

    public byte getIsRequired() {
        return isRequired;
    }

    public byte getIsPrinted() {
        return isPrinted;
    }

    public byte getIsValidateOnLine() {
        return isValidateOnLine;
    }

    public String getType() {
        return type;
    }

    public int getMin_length() {
        return min_length;
    }

    public int getMax_length() {
        return max_length;
    }

    public double getDouble_input() {
        return double_input;
    }

    public String getValue() {
        return value;
    }

    public String getReg_exp() {
        return reg_exp;
    }

    public long getFrom_debt() {
        return from_debt;
    }

    public List<ParList> getParLists() {
        return parLists;
    }

    @Override
    public String toString() {
        return "Par{" +
                "step=" + step +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", comment='" + comment + '\'' +
                ", isEditable=" + isEditable +
                ", isScannble=" + isScannble +
                ", isVisible=" + isVisible +
                ", isRequired=" + isRequired +
                ", isPrinted=" + isPrinted +
                ", isValidateOnLine=" + isValidateOnLine +
                ", type='" + type + '\'' +
                ", min_length=" + min_length +
                ", max_length=" + max_length +
                ", double_input=" + double_input +
                ", value='" + value + '\'' +
                ", reg_exp='" + reg_exp + '\'' +
                ", from_debt=" + from_debt +
                ", parLists=" + parLists +
                '}';
    }
}
