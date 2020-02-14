/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SpinnerSubsystem;

public class SetSpinnerPower extends CommandBase {

  private double m_power;
  private final SpinnerSubsystem m_wheel;

  /**
   * Creates a new SetSpinnerPower.
   */
  public SetSpinnerPower(SpinnerSubsystem wheel, double power) {

    m_power = power;
    m_wheel = wheel;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_wheel);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    m_wheel.setPower(m_power);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    m_wheel.setPower(0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
