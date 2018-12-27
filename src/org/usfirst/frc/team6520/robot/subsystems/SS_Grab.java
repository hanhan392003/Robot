package org.usfirst.frc.team6520.robot.subsystems;

import org.usfirst.frc.team6520.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SS_Grab extends Subsystem {
	public void grab() {
		RobotMap.grab.set(0.2);
	}
	
	public void out() {
		RobotMap.grab.set(-0.2);
	}
	
	public void stop() {
		RobotMap.grab.set(0);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

