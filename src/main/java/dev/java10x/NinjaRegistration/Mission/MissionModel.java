package dev.java10x.NinjaRegistration.Mission;

import dev.java10x.NinjaRegistration.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mission")
public class MissionModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String difficulty;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjaList;

    public MissionModel(){}

    public MissionModel(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }
}
