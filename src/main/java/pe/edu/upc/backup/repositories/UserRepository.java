package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.backup.entities.Role;
import pe.edu.upc.backup.entities.Users;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);
    @Transactional
    @Modifying
    @Query(value = "UPDATE Users u SET u.role = :role WHERE u.id = :userId")
    public void insRol(@Param("role") Role role, @Param("userId") Long userId);

    @Query(value = "SELECT * FROM users ORDER BY id DESC LIMIT 1", nativeQuery = true)
    public Users findFirstByOrderByIdDesc();
}
