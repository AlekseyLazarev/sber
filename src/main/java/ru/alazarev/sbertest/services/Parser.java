package ru.alazarev.sbertest.services;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ru.alazarev.sbertest.entity.Order;
import ru.alazarev.sbertest.entity.Par;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class Parser
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
public class Parser {
    private final File file;
    private Order order;

    public Parser(File file) {
        this.file = file;
    }

    private Order getOrder() {
        if (this.order == null) {
            try {
                XmlMapper mapper = new XmlMapper();
                this.order = mapper.readValue(file, Order.class);
            } catch (JsonParseException | JsonMappingException jsonException) {
                jsonException.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return this.order;
    }

    private List<Par> getListOfPar() {
        return getOrder().getServices().getServ().getPars();
    }

    public List getAllDocsSortedByAsc() {
        List allDocs = new ArrayList();
        getListOfPar().stream()
                .filter(par -> par.getParLists() != null)
                .forEach(par -> allDocs.addAll(par.getParLists()));
        Collections.sort(allDocs);
        return allDocs;
    }

    public List getAttributesFromParByStepAndName(int step, String name) {
        List result = new ArrayList();
        getListOfPar().stream()
                .filter(par -> par.getStep() == step && name.equals(par.getName()))
                .forEach(par -> result.add(par));
        return result;
    }
}
