package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
//All table related must have the @audited anotattion
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;

    private String descricao;

}
