package ru.alazarev.sbertest;

import ru.alazarev.sbertest.services.DAO;
import ru.alazarev.sbertest.services.Parser;

import java.io.File;
import java.util.*;

/**
 * Class App
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
public class App {
    public static void main(String[] args) {
        File xml = new File(App.class.getResource("/data.xml").getFile());
        System.out.println(xml.getAbsolutePath());
        DAO dao = new DAO();
        Parser parser = new Parser(xml);
        List first = parser.getAllDocsSortedByAsc();
        List second = parser.getAttributesFromParByStepAndName(1, "ГРАЖДАНСТВО");
        System.out.println(first);
        System.out.println(second);
        dao.addParListToDataBase(first);
    }
}
