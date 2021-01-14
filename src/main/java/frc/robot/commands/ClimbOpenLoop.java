package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.ClimberSubsystem;

public class ClimbOpenLoop extends InstantCommand {
    double speed;
    ClimberSubsystem climb;
    public ClimbOpenLoop(ClimberSubsystem climb, double speed) {
        addRequirements(climb);
        this.speed = speed;
        this.climb = climb;
    }
    @Override
    public void initialize() {
        climb.Run(speed);
    }
}