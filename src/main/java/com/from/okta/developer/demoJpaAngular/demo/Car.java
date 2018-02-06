package com.from.okta.developer.demoJpaAngular.demo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private @NotNull String name;
}
