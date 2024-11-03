package com.irusri.todo_app.controller;

//import com.irusri.todo_app.dto.UserLoginDTO;
//import com.irusri.todo_app.model.User;
//import com.irusri.todo_app.service.UserService;
//import com.irusri.todo_app.util.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/api/auth")
public class AuthController {
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody UserLoginDTO userDTO) {
//        User user = userService.findByUsername(userDTO.getUsername());
//
//        if (user != null && passwordEncoder.matches(userDTO.getPassword(), user.getPassword())) {
//            String token = jwtUtil.generateToken(user.getUsername());
//            return ResponseEntity.ok(token);
//        }
//        return ResponseEntity.status(401).body("Unauthorized");
//    }
}
