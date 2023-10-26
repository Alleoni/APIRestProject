package br.com.grupo6.projetoGrupo6.repository;

import br.com.grupo6.projetoGrupo6.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
