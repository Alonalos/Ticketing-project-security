package com.cybertek.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
@EntityListeners(BaseEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,updatable = false)
    public LocalDateTime insertDateTime;
    @Column(nullable = false,updatable = false)
    public Long insertUserId;
    @Column(nullable = false)
    public LocalDateTime lastUpdateDateTime;
    @Column(nullable = false)
    public Long lastUpdateUserId;

    private Boolean isDeleted=false;



}