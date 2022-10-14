package br.com.ibm.registeruser.service;

import br.com.ibm.registeruser.model.RegisterUserModel;
import br.com.ibm.registeruser.repository.RegisterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public RegisterUserModel findById(Long id){
        Optional<RegisterUserModel> userModel = repository.findById(id);
        return userModel.get();
    }
}
