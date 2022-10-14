package br.com.ibm.registeruser.controller;

import br.com.ibm.registeruser.model.RegisterUserModel;
import br.com.ibm.registeruser.service.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/register-user")
public class RegisterUserController {

    @Autowired
    private RegisterUserService service;

    @PostMapping
    public ResponseEntity<RegisterUserModel> insert(@RequestBody RegisterUserModel userModel){
        userModel = service.insertUser(userModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userModel.getId()).toUri();
        return ResponseEntity.created(uri).body(userModel);
    }

    @GetMapping
    public ResponseEntity<List<RegisterUserModel>> findAll(){
        List<RegisterUserModel> listUser = service.findAll();
        return ResponseEntity.ok().body(listUser);
    }
}
