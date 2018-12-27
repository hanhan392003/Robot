package org.usfirst.frc.team6520.robot.commands;

import org.usfirst.frc.team6520.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class C_Backward extends Command {
	double seconds;
	double initTime = Timer.getFPGATimestamp();
    public C_Backward(double seconds) {
    	this.seconds = seconds;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while((Timer.getFPGATimestamp()-initTime)<seconds) {
    		RobotMap.ss_drivebase.run_backward();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.ss_drivebase.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.ss_drivebase.stop();
    }
}
