//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ma.formation.jpa.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import ma.formation.jpa.service.model.User;

public class DaoImplJPA implements IDao {

    private EntityManager session = null;

    public DaoImplJPA() {
    }

    public List<User> findAllUsers() {
        List<User> users = new ArrayList();

        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            users = this.session.createQuery("from User").getResultList();
            this.session.close();
        } catch (Exception var6) {
            Exception e = var6;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

        return users;
    }

    public User getUserByUsername(String username) {
        User user = null;

        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            Query request = this.session.createQuery("select u from User u where u.username=:username");
            request.setParameter("username", username);
            List<User> liste = request.getResultList();
            if (liste != null && !liste.isEmpty()) {
                user = liste.get(0);
            }

            this.session.close();
        } catch (Exception var8) {
            Exception e = var8;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

        return user;
    }
    @Override
    public User getUserByEmail(String email) {
        User user = null;
        try {
            session = DatabaseManager.getSessionFactory().createEntityManager();
            Query request = session.createQuery("select u from User u where u.email = :email", User.class);
            request.setParameter("email", email);
            List<User> liste = request.getResultList();
            if (liste != null && !liste.isEmpty())
                user = liste.get(0);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
        return user;
    }
    public void save(User user) {
        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            EntityTransaction tx = this.session.getTransaction();
            tx.begin();
            this.session.merge(user);
            tx.commit();
            this.session.close();
        } catch (Exception var6) {
            Exception e = var6;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

    }

    public void deleteAll() {
        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            EntityTransaction tx = this.session.getTransaction();
            tx.begin();
            this.session.createQuery("delete from User").executeUpdate();
            tx.commit();
            this.session.close();
        } catch (Exception var5) {
            Exception e = var5;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

    }

    public User findById(Long id) {
        User user = null;

        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            user = (User)this.session.find(User.class, id);
            this.session.close();
        } catch (Exception var7) {
            Exception e = var7;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

        return user;
    }

    public void delete(Long id) {
        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            EntityTransaction tx = this.session.getTransaction();
            tx.begin();
            User userFoud = (User)this.session.find(User.class, id);
            if (userFoud != null) {
                this.session.remove(userFoud);
            }

            tx.commit();
            this.session.close();
        } catch (Exception var7) {
            Exception e = var7;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

    }
}
