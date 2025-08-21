package ru.rustam.otus.dz2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rustam.otus.dz2.UserUtil;
import ru.rustam.otus.dz2.models.UserDto;
import ru.rustam.otus.dz2.service.UserService;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<Void> createUser(@RequestBody UserDto user) {
        userService.createUser(UserUtil.convert(user));
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable long userId) {
        var userDto = userService.getUser(userId);
        return ResponseEntity.ok(UserUtil.convert(userDto));
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/user/{userId}")
    public ResponseEntity<Void> updateUser(@PathVariable long userId,
                                           @RequestBody UserDto user) {
        userService.updateUser(userId, UserUtil.convert(user));
        return ResponseEntity.noContent().build();
    }

}
