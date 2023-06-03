package br.com.acme.application.domain.entity;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Card {
    private Long id;
    private String flag;
    private String number;
    private BigDecimal limit;
}
