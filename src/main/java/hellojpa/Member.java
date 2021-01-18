package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Member {

    @Id
    private Long id;
    private String name;

    @Builder
    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
