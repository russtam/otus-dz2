package ru.rustam.otus.dz2.service;

import ru.rustam.otus.dz2.db.UserEntity;

import java.util.Optional;

public interface UserService {

    UserEntity createUser(UserEntity user);

    UserEntity getUser(Long id);

    void deleteUser(Long id);

    void updateUser(Long id, UserEntity user);
}
