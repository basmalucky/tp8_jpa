//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ma.formation.jpa.dao.article;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import ma.formation.jpa.dao.DatabaseManager;
import ma.formation.jpa.service.model.Article;

public class ArticleDaoImplJPA implements IArticleDao {
    private EntityManager session;

    public ArticleDaoImplJPA() {
    }

    public List<Article> findAll() {
        List<Article> articles = new ArrayList();

        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            articles = this.session.createQuery("from Article").getResultList();
            this.session.close();
        } catch (Exception var6) {
            Exception e = var6;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

        return articles;
    }

    public void save(Article article) {
        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            EntityTransaction tx = this.session.getTransaction();
            tx.begin();
            this.session.merge(article);
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
            this.session.createQuery("delete from Article").executeUpdate();
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

    public Article findById(Long id) {
        Article article = null;

        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            article = this.session.find(Article.class, id);
            this.session.close();
        } catch (Exception var7) {
            Exception e = var7;
            e.printStackTrace();
        } finally {
            if (this.session != null) {
                this.session.close();
            }

        }

        return article;
    }

    public void delete(Long id) {
        try {
            this.session = DatabaseManager.getSessionFactory().createEntityManager();
            EntityTransaction tx = this.session.getTransaction();
            tx.begin();
            Article articleFound = this.session.find(Article.class, id);
            if (articleFound != null) {
                this.session.remove(articleFound);
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
