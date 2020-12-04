package frc.robot.controls;

import frc.robot.commands.IntakeRunCommand;
import frc.robot.commands.MotorSpeedCommand;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class Controls {
    public Controls(ExampleSubsystem subsystem, IntakeSubsystem intake) {
        SmartDashboard.putData("run", new MotorSpeedCommand(subsystem, 0.5));
        SmartDashboard.putData("stop", new MotorSpeedCommand(subsystem, 0.0));

        SmartDashboard.putData("stop", new IntakeRunCommand(intake, 0.5));
    }
}