/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

// Motors
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Spark;

public class Drivetrain extends SubsystemBase {
  
  double driveSpeed;
  double turnSpeed;
  double throttle;

  // Motors
  public static Spark rightSide = new Spark(0); // both right sparks on on one split PWM signal
  public static Spark leftSide = new Spark(1);  // both right sparks on on one split PWM signal

  public Drivetrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setSpeed(double driveSpeed, double turnSpeed, double throttle){
    leftSide.set(throttle * driveSpeed);
    rightSide.set(-throttle * driveSpeed);
  }
}
