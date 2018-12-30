package org.usfirst.frc.team6520.robot.commands;

import org.usfirst.frc.team6520.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class C_Out extends Command {
	double seconds;
	double initTime = Timer.getFPGATimestamp();
    public C_Out(double seconds) {
    	this.seconds = seconds;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	while (RobotMap.encoder.getRaw() < -10) {
    		RobotMap.grab.set(1);
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	while((Timer.getFPGATimestamp()-initTime)<seconds) {
//    		RobotMap.ss_grab.out();
//    	}
//    	RobotMap.grab.setInverted(true);
//    	RobotMap.grab.set(-1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
//    	RobotMap.ss_grab.stop();

    	RobotMap.grab.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
//    	RobotMap.ss_grab.stop();
    }
}
