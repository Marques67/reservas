package br.com.fiap.reservas.infra.repository.avaliacao;

import br.com.fiap.reservas.entities.AvaliacaoEntity;
import br.com.fiap.reservas.entities.RestauranteEntity;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "restaurante_id")
    private Long restauranteId;

    private int nota;

    private String comentario;

    @Column(name = "usuario_id")
    private Long usuarioId;

    public Avaliacao() {
    }

    public Avaliacao(Long restauranteId, int nota, String comentario, Long usuarioId) {
        this.restauranteId = restauranteId;
        this.nota = nota;
        this.comentario = comentario;
        this.usuarioId = usuarioId;
    }

    public Avaliacao(AvaliacaoEntity avaliacaoEntity) {
        this.restauranteId = avaliacaoEntity.getRestaurante().getId();
        this.nota = avaliacaoEntity.getNota();
        this.comentario = avaliacaoEntity.getComentario();
        this.usuarioId = avaliacaoEntity.getUsuario().getId();
    }

    public Long getId() {
        return id;
    }

    public Long getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(Long restauranteId) {
        this.restauranteId = restauranteId;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}