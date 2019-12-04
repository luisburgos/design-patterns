package adapter.examples.users;

import java.util.stream.Collectors;

public class UserConverter extends AbstractConverter<User, UserDto>{

	@Override
	public User fromDto(UserDto dto) {
		User user = new User();
		user.setId(dto.getId());
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		
		// Prevent NullPointerException
		if(dto.getRoles()!=null) {
			user.setRoles(dto.getRoles().stream().map(rol -> Role.valueOf(rol)).collect(Collectors.toList()));
		}
		return user;
	}

	@Override
	public UserDto fromEntity(User entity) {
		UserDto user = new UserDto();
		user.setId(entity.getId());
		user.setUsername(entity.getUsername());
		user.setPassword(entity.getPassword());
		
		// Prevent NullPointerException
		if(entity.getRoles()!=null) {
			user.setRoles(entity.getRoles().stream().map(rol -> rol.name()).collect(Collectors.toList()));
		}
		return user;
	}
}
