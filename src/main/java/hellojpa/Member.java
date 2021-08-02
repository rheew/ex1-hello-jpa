package hellojpa;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private Long id;
    private String name;
    private int age;

}
