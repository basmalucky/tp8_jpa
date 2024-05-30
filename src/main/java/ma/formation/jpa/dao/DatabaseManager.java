//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ma.formation.jpa.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseManager {
    private static EntityManagerFactory sessionFactory;

    private DatabaseManager() {
    }

    public static EntityManagerFactory getSessionFactory() {
        if (sessionFactory != null) {
            return sessionFactory;
        } else {
            try {
                sessionFactory = Persistence.createEntityManagerFactory("unite1");
            } catch (Exception var1) {
                Exception e = var1;
                e.printStackTrace();
            }

            return sessionFactory;
        }
    }
}
