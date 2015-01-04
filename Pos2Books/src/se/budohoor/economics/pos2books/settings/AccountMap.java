package se.budohoor.economics.pos2books.settings;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "AccountMap.findAll", query = "select o from AccountMap o") })
@Table(name = "\"AccountMap\"")
public class AccountMap implements Serializable {
    @Column(name = "account")
    private int account;
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    public AccountMap() {
    }

    public AccountMap(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
