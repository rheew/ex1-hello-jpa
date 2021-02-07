package hellojpa;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name", nullable = false)
    private String username;

    @Builder
    public Member(String id, String username) {
        this.id = id;
        this.username = username;
    }

}
