/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

/**
 * An example command. You can replace me with your own command.
 */
public class Drive extends Command {

  public Drive(DriveTrain driveTrain) {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // if (driveTrain.arcadeDrive) {
    double y = OI.arcadeDriveY();
    double arcadeR = OI.arcadeDriveR();
    Robot.driveTrain.arcadeDrive(y, arcadeR);
    // } else {
    // double tankR = OI.tankDriveRight();
    // double l = OI.tankDriveLeft();
    // driveTrain.tankDrive(tankR, l);
    // }

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    // if (driveTrain.arcadeDrive) {
    Robot.driveTrain.arcadeDrive(0, 0);
    // } else {
    // driveTrain.tankDrive(0, 0);
    // }
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
