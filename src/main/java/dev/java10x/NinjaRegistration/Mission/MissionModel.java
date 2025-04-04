package dev.java10x.NinjaRegistration.Mission;

import dev.java10x.NinjaRegistration.Ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_mission")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class MissionModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String difficulty;

    @OneToMany(mappedBy = "mission")
    @NonNull
    private List<NinjaModel> ninjaList;
}
