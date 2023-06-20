package pe.edu.upc.backup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.backup.entities.Users;
import pe.edu.upc.backup.services.IUserService;

import javax.validation.Valid;

@Controller
@Secured({"ROLE_ADMIN"})
@RequestMapping("/users")
public class UserController {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IUserService userService;

    @PostMapping("/save")
    public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            String bcryptPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(bcryptPassword);
            int rpta = userService.insert(user);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usersecurity/user";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", userService.list());
        return "usersecurity/listUser";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", userService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
}
