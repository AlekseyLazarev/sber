package ru.alazarev.sbertest.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.alazarev.sbertest.entity.ParList;

import java.util.List;

/**
 * Class DAO
 * <p>
 * Date: 31.01.2020
 *
 * @author a.lazarev
 */
public class DAO {
    public void addParListToDataBase(List<ParList> parLists) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(ParList.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            for (ParList parList : parLists) {
                session.save(parList);
            }
            session.getTransaction().commit();
        }
    }
}
