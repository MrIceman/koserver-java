package koserver.game.database.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import koserver.common.database.entity.AbstractDatabaseEntity;

@Entity
@Table(name = "account")
public class AccountEntity extends AbstractDatabaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "nation")
	private int nation;

	@Column(name = "authority")
	private int authority;

	@Column(name = "sealPassword")
	private String sealPassword;

	@Column(name = "cash")
	private int cash;

	@Column(name = "birhDate")
	private Date birthDate;

	@Column(name = "email")
	private String email;

	@Column(name = "creation")
	private Date creation;

	@Column(name = "access")
	private Date access;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "account", cascade = CascadeType.ALL)
    private Set<PlayerEntity> players;

	public AccountEntity(final Integer id) {
		super(id);
	}

	public AccountEntity() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNation() {
		return nation;
	}

	public void setNation(int nation) {
		this.nation = nation;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

	public String getSealPassword() {
		return sealPassword;
	}

	public void setSealPassword(String sealPassword) {
		this.sealPassword = sealPassword;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public Date getAccess() {
		return access;
	}

	public void setAccess(Date access) {
		this.access = access;
	}
	
	public Set<PlayerEntity> getPlayers() {
        return players;
    }

    public void setPlayers(final Set<PlayerEntity> players) {
        this.players = players;
    }
}
