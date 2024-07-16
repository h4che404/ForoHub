package com.delazete.forohub.domain.cursos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroCurso(

        @NotBlank
        String nombre,
        @Nullable
        String categoria
) {
}
