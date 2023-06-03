package br.com.client.application.domain.entity;

import br.com.client.application.domain.vo.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {
    private Long id;
    private Email email;
    private Document document;
    private Phone phone;
}
