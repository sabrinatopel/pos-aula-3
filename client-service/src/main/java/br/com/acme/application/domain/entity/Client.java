package br.com.acme.application.domain.entity;

import br.com.acme.application.domain.vo.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {
    private Long id;
    private String name;
    private Email email;
    private Document document;
    private Phone phone;
}
