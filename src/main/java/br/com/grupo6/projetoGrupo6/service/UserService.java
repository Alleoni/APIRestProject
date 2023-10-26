package br.com.grupo6.projetoGrupo6.service;

import br.com.grupo6.projetoGrupo6.entities.User;
import br.com.grupo6.projetoGrupo6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
        return this.userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findyById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id, User user) {
        User userUpdated = findyById(id);
        updateData(userUpdated, user);
        return userRepository.save(userUpdated);
    }


        private void updateData(User userUpdate, User user){
            userUpdate.setName(user.getName());
            userUpdate.setAge(user.getAge());
        }

}
