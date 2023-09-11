package com.pedro.crud.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pedro.crud.entities.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private OffsetDateTime dateOrder;

    @Enumerated(EnumType.STRING)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
}
