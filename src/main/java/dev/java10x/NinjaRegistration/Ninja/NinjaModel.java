package dev.java10x.NinjaRegistration.Ninja;

import dev.java10x.NinjaRegistration.Mission.MissionModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "tb_register" )
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private int age;

    @ManyToOne
    @JoinColumn(name = "id_mission") // Foreign Key
    @NonNull
    private MissionModel mission;
}
