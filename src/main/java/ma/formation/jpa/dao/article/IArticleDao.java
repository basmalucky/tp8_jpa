//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ma.formation.jpa.dao.article;

import java.util.List;
import ma.formation.jpa.service.model.Article;

public interface IArticleDao {
    Article findById(Long var1);

    void delete(Long var1);

    List<Article> findAll();

    void save(Article var1);

    void deleteAll();
}
