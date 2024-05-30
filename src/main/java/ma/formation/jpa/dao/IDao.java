//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ma.formation.jpa.dao;

import java.util.List;
import ma.formation.jpa.service.model.User;

public interface IDao {
    User findById(Long var1);

    void delete(Long var1);

    List<User> findAllUsers();

    User getUserByUsername(String var1);

    void save(User var1);

    void deleteAll();



    User getUserByEmail(String email);

}
