package org.usfirst.frc.team6520.robot.subsystems;

import org.usfirst.frc.team6520.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SS_ConveyBelt extends Subsystem {
	public boolean roll = false;
	public boolean direction = true;
	public double speed = 0.8;
	
	public void roll(){
//		RobotMap.belt.set((roll) ? ((direction) ? speed : -speed) : 0);
//		if (roll) {
//			if (direction) {
				RobotMap.belt.set(speed);
//			} else {
//				RobotMap.belt.set(-speed);
//			}
//		}
	}
	
	public void roll_() {
		RobotMap.belt.set(-speed);
	}
	
	public void stop() {
		RobotMap.belt.stopMotor();
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

