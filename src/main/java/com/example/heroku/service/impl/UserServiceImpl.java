package com.example.heroku.service.impl;

import com.example.heroku.dto.UserDTO;
import com.example.heroku.entity.User;
import com.example.heroku.exception.ValidateException;
import com.example.heroku.repo.UserRepo;
import com.example.heroku.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void registerUser(UserDTO dto) {

        userRepo.save(mapper.map(dto, User.class));
    }

    @Override
    public ArrayList<UserDTO> getAllUsers() {
        List<User> all = userRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<UserDTO>>() {
        }.getType());
    }
}
