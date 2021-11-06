package com.example.heroku.service;

import com.example.heroku.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    void registerUser(UserDTO dto);

    ArrayList<UserDTO> getAllUsers();

}
