package org.usfirst.frc.team6520.robot.subsystems;

import org.usfirst.frc.team6520.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SS_ConveyBelt extends Subsystem {
	public void roll(){
		RobotMap.belt.set(0.5);
	}
	
	public void roll_() {
		RobotMap.belt.set(-0.5);
	}
	
	public void stop() {
		RobotMap.belt.set(0);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

