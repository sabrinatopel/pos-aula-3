package br.com.client.application.domain.vo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {
    private Long id;
    private String code;
    private String number;
}
