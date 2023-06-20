package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
