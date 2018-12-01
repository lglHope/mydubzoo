package liu.hope.mydubzoo.pojo;

import liu.hope.mydubzoo.base.BaseEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Authou hope
 */
public class User extends BaseEntity {

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	@Length(min=6,max = 20,message="密码长度不能小于6位,大于20位")
	private String password;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 账号状态 0：正常 1：禁用
	 */
	private String status;

	/**
	 * 角色编码
	 */
	private String roleCode;

	/**
	 * 机构编码
	 */
	private String organizationCode;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}


	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", status='" + status + '\'' +
				", roleCode='" + roleCode + '\'' +
				", organizationCode='" + organizationCode + '\'' +
				'}';
	}
}