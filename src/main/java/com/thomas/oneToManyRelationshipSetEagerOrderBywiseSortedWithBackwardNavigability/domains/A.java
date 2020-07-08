package com.thomas.oneToManyRelationshipSetEagerOrderBywiseSortedWithBackwardNavigability.domains;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "A")
@NoArgsConstructor
@Setter @Getter
@EqualsAndHashCode(of = {"id"})
public class A implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String a;

    @OneToMany(mappedBy = "a", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("b ASC")
    private Set<B> bSet = new TreeSet<B>();

    public A(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        String toReturn = "A{" +
                "id=" + id +
                ", a='" + a + "' Bs : ";
        for(B b : bSet) {
        	toReturn += b.getB()+" ";
        }
        toReturn += '}';
        return toReturn;
    }
}