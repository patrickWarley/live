package com.dio.live.model;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @EmbeddedId
    private BancoHorasID bancoHorasID;

//    @ManyToOne
//    private CategoriaUsuario categoriaUsuario;
//    Creating the attribute categoriaUsuario is redundant because we already hava the id usuario on the prymary key

    private LocalDateTime dataTrabalhada;
    private BigDecimal qtdHoras;
    private BigDecimal saldoHoras;
}
