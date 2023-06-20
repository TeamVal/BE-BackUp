package pe.edu.upc.backup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.backup.entities.Role;
import pe.edu.upc.backup.services.IRoleService;
import pe.edu.upc.backup.services.IUserService;

import javax.validation.Valid;

@Controller
@SessionAttributes
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @GetMapping("/new")
    public String newRole(Model model) {
        model.addAttribute("role", new Role());
        model.addAttribute("listaUsuarios", userService.list());
        return "role/role";
    }

    @PostMapping("/save")
    public String saveRole(@Valid Role role, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            return "role/role";
        } else {
            roleService.insert(role);
            model.addAttribute("mensaje", "Se guardó correctamente");
            status.setComplete();
        }
        model.addAttribute("listaRoles", roleService.list());
        return "role/role";
    }

    @GetMapping("/list")
    public String listRole(Model model) {
        try {
            model.addAttribute("listaRoles", roleService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "role/listRole";
    }
}
