package rabehi.store.productms.entity;


import javax.persistence.*;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "tbl_categories")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;



}
