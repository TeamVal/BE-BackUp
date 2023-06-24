    package pe.edu.upc.backup.controllers;

    import org.modelmapper.ModelMapper;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.security.crypto.password.PasswordEncoder;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;
    import pe.edu.upc.backup.dtos.UserDTO;
    import pe.edu.upc.backup.entities.Users;
    import pe.edu.upc.backup.services.IUserService;

    import java.util.List;
    import java.util.stream.Collectors;

    @RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private PasswordEncoder passwordEncoder;

        @Autowired
        private IUserService userService;


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

        @GetMapping("/listar")
        public List<UserDTO> List(){
            return userService.list().stream().map(x->{
                ModelMapper m=new ModelMapper();
                return m.map(x, UserDTO.class);
            }).collect(Collectors.toList());
        }

        @PostMapping("/insert")
        public void insert(@RequestBody UserDTO dto){
            String bcryptPassword = passwordEncoder.encode(dto.getPassword());
            dto.setPassword(bcryptPassword);
            ModelMapper m=new ModelMapper();
            Users a=m.map(dto, Users.class);
            userService.insert(a);
        }

        @GetMapping("/last")
        public UserDTO getLastUser() {
            Users lastUser = userService.last();
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(lastUser, UserDTO.class);
        }
    }
