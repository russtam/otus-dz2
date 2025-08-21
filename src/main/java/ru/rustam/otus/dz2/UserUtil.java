package ru.rustam.otus.dz2;

import lombok.experimental.UtilityClass;
import ru.rustam.otus.dz2.db.UserEntity;
import ru.rustam.otus.dz2.models.UserDto;

@UtilityClass
public class UserUtil {

    public UserEntity convert(UserDto src) {
        UserEntity dst = new UserEntity();
        dst.setId(src.getId());
        dst.setUsername(src.getUsername());
        dst.setFirstName(src.getFirstName());
        dst.setLastName(src.getLastName());
        dst.setEmail(src.getEmail());
        dst.setPhone(src.getPhone());
        return dst;
    }

    public UserDto convert(UserEntity src) {
        UserDto dst = new UserDto();
        dst.setId(src.getId());
        dst.setUsername(src.getUsername());
        dst.setFirstName(src.getFirstName());
        dst.setLastName(src.getLastName());
        dst.setEmail(src.getEmail());
        dst.setPhone(src.getPhone());
        return dst;
    }

}
