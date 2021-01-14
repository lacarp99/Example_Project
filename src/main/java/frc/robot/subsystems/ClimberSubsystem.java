package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimberSubsystem extends SubsystemBase {
    private static PWMTalonSRX climb;
    private static Servo ratchet;

    public ClimberSubsystem() {
        climb = new PWMTalonSRX(3);
        ratchet = new Servo(4);
        engageRatchet(true);
    }

    public void Run(double speed) {
        climb.set(speed);
    }

    public void Stop() {
        climb.set(0);
    }

    public void engageRatchet(boolean engage) {
        if (engage) {
            ratchet.set(Constants.ENGAGED);
            System.out.println("Running");
        }
        else {
            ratchet.set(Constants.DISENGAGED);
        }
    }
}