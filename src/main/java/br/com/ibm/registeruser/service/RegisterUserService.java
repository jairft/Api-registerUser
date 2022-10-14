package br.com.ibm.registeruser.service;

import br.com.ibm.registeruser.model.RegisterUserModel;
import br.com.ibm.registeruser.repository.RegisterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterUserService {

    @Autowired
    private RegisterUserRepository repository;

    public RegisterUserModel insertUser(RegisterUserModel user){
        return repository.save(user);
    }

    public List<RegisterUserModel> findAll() {
        return repository.findAll();
    }
}
