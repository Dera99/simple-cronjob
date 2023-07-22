package com.dera.spring.test.cronjob.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
public class UserModel {
    public UserModel(){
    
    }
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
}