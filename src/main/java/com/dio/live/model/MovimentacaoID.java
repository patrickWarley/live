package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Embeddable
public class MovimentacaoID implements Serializable {
    private Long idMovimento;
    private Long idUsuario;
}
