package br.com.acme.application.domain.vo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Document {
    private Long id;
    private String number;
}
