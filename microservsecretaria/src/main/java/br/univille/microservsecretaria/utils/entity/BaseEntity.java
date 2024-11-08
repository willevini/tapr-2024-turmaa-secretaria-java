package br.univille.microservsecretaria.utils.entity;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

public abstract class BaseEntity {
    
    @Id
    private String id;

    @CreatedDate
    private Date dateCreated;

    @LastModifiedDate
    private Date dateUpdated;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
        this.dateCreated = new Date();
        this.dateUpdated = new Date();
    }
}
