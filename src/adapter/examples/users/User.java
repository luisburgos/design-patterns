package adapter.examples.users;

import java.util.List;

public class User {
	private Long id;
	private String username;
	private String password;
	private List<Role> roles;
	private Boolean active;
	
	public User() {
		super();
	}

	public User(Long id, String username, String password, List<Role> roles, Boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.active = active;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + ", active="
				+ active + "]";
	}
}
