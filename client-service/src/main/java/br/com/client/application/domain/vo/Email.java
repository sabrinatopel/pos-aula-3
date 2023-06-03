package br.com.client.application.domain.vo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {
    private Long id;
    private String description;

}
