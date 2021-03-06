package org.usfirst.frc.team6520.robot.commands;

import org.usfirst.frc.team6520.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class C_Roll_1 extends Command {

    public C_Roll_1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	RobotMap.ss_conveybelt.direction = !RobotMap.ss_conveybelt.direction;
    	if (RobotMap.ss_conveybelt.direction) {
    		RobotMap.ss_conveybelt.direction = false;
    	} else {
    		RobotMap.ss_conveybelt.direction = true;
    	}
   	    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	RobotMap.ss_conveybelt.roll_();

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.ss_conveybelt.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
//    	RobotMap.ss_conveybelt.stop/();
    }
}
