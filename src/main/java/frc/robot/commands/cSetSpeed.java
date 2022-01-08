/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.function.DoubleSupplier;

/**
 * An example command that uses an example subsystem.
 */
public class cSetSpeed extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivetrain m_drivetrain;

  private final DoubleSupplier m_driveSpeed;
  private final DoubleSupplier m_turnSpeed;
  private final DoubleSupplier m_throttle;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   * 
   * @param driveSpeed The forward-backward force.
   * @param turnSpeed The rotational force.
   * @param throttle Multiplier for all drive speeds.
   */
  public cSetSpeed(Drivetrain subsystem, DoubleSupplier driveSpeed, DoubleSupplier turnSpeed, DoubleSupplier throttle) {
    m_drivetrain = subsystem;

    m_driveSpeed = driveSpeed;
    m_turnSpeed = turnSpeed;
    m_throttle = throttle;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.setSpeed(m_driveSpeed.getAsDouble(), m_turnSpeed.getAsDouble(), m_throttle.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
