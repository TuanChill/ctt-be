package com.ctt.cttbe.Entity.UserAuth;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@Entity
@Table(name = "user_auth")
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAuth {
    @Id
    @Column(nullable = false)
    private String msv;
    @Column(nullable = false)
    private String password;

    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;

}
