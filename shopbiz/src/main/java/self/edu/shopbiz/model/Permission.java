package self.edu.shopbiz.model;

import javax.persistence.*;
import java.util.Collection;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by mpjoshi on 10/18/19.
 */

@Data
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"NAME"})})
public class Permission {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToMany(mappedBy = "permissions")
    private Collection<Role> roles;
}
