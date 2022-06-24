package edu.miu.productreview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;
    private String city;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private Users users;

//    @JoinColumn(name = "user_id", insertable = false, updatable = false)
//    @OneToOne(targetEntity = Users.class, fetch = FetchType.EAGER)
//    @JsonIgnore
//    private Users users;
//
//    @Column(name = "user_id")
//    private Long userId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
}
