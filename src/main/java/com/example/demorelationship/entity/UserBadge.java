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
@Table(name = "user_badge")
public class UserBadge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", nullable = false)
    private Account account;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "badge_id", nullable = false)
    private Badge badge;
}
