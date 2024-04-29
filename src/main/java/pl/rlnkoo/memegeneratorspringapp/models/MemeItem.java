package pl.rlnkoo.memegeneratorspringapp.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Data
public class MemeItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    @Lob
    private byte[] image;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "MemeItem{" +
                "id=" + id +
                ", title='" + title + "'" +
                ", createdAt='" + createdAt + "'" +
                ", updatedAt='" + updatedAt + "'" +
                "}";


    }
}
