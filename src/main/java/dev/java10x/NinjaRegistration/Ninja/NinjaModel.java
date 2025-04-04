package dev.java10x.NinjaRegistration.Ninja;

import dev.java10x.NinjaRegistration.Mission.MissionModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_register" )
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;

    @ManyToOne
    @JoinColumn(name = "id_mission") // Foreign Key
    private MissionModel mission;

    public NinjaModel(){}

    public NinjaModel(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public NinjaModel(String name, String email, int age, MissionModel mission) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.mission = mission;
    }
}
