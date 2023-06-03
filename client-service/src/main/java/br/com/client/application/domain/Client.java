package br.com.client.application.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {
    private long id;
    private String name;
    private String email;
    private String document;
    private String phone;
}
