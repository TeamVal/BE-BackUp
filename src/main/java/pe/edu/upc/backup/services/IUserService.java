package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();

}
