package br.com.spring.blog.springblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Entity
@Table(name="TB_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera os IDs automaticamente
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate data;

    @NotBlank
    @Lob    // Banco aceitar valores grandes
    private String texto;


}
