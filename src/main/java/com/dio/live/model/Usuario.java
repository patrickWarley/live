package com.dio.live.model;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private Long id;

    //Varios usuarios podem estar associado a uma categoria
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nomeUsuario;
    //Uma empresa possui varios empregados
    @ManyToOne
    private Empresa empresa;
    //um nivel de acesso pode estar associado a varios usuarios
    @ManyToOne
    private NivelAcesso nivelAcesso;
    //Varios usuarios pode ter a mesma jornada de trabalho
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
