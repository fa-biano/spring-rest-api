package dio.restapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.restapi.model.User;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada repository");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada repository");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um User", id));
        System.out.println(id);
    }
    
    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Julia", "password"));
        users.add(new User("Frank", "password"));
        return users;
    }
    
    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para encontrar um User", id));
        return new User("Julia", "password");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para encontrar um User", username));
        return new User("Julia", "password");
    }
    
}
