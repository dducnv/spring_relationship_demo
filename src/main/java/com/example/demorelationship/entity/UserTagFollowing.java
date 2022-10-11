package com.example.demorelationship.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user_tag_following")
public class UserTagFollowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", nullable = false)
    private Account account;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag;
}
