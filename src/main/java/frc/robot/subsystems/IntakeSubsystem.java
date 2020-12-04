package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PWMTalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import java.util.List;

public class IntakeSubsystem extends SubsystemBase {
  public static double lastIntakePressedTime = 0;

  public static int TALON_ID = 2;

  private static PWMTalonFX intakeDrive;
  private static DigitalInput beamBreak;

  public IntakeSubsystem() {
    intakeDrive = new PWMTalonFX(TALON_ID);
    beamBreak = new DigitalInput(0);

  }

  public void stopIntake() {
    intakeDrive.set(0.0);
  }

  public void runIntake(double setpoint) {
    intakeDrive.set(setpoint);
  }

  public boolean getBeam() {
      return beamBreak.get();
  }
}
