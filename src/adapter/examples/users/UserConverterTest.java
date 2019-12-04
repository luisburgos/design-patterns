package adapter.examples.users;

import java.util.Arrays;

public class UserConverterTest {
	public static void main(String[] args) {
        UserDto userDto;
        userDto = new UserConverter().fromEntity(new User(1L, "admin", "424df7*9$cae", Arrays.asList(Role.ADMIN), true));
        System.out.println(userDto);
    }
}
