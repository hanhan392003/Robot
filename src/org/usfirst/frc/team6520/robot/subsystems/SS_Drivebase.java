package org.usfirst.frc.team6520.robot.subsystems;

import org.usfirst.frc.team6520.robot.Robot;
import org.usfirst.frc.team6520.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SS_Drivebase extends Subsystem {

	public final double speed = 0.6; 
	public double leftSpeed = speed; 
	public double rightSpeed = -speed; 
	double boostSpeed = 1; 


	public void leftSide() { //nhân giá trị joystick trái với hệ số (joystick của controller lái)
		RobotMap.left.set(Robot.m_oi.gamepad.getRawAxis(5) * leftSpeed);
	}

	public void rightSide() { //nhân giá trị joystick phải với hệ số
		RobotMap.right.set(Robot.m_oi.gamepad.getRawAxis(1) * rightSpeed);
	}


	public void driveTwoJoysticks() { //method kết hợp 3 method trên
		leftSide();
		rightSide();
	}
	
	public void run_forward() {
		RobotMap.left.set(0.5);
		RobotMap.right.set(-0.5);
	}
	
	public void run_backward() {
		RobotMap.left.set(-0.5);
		RobotMap.right.set(0.5);
	}
	
	public void turn_right() {
		RobotMap.left.set(0);
		RobotMap.right.set(0.5);
	}
	
	public void turn_left() {
		RobotMap.right.set(0);
		RobotMap.left.set(0.5);
	}
	public void stop() {
		RobotMap.left.set(0);
		RobotMap.right.set(0);
	}

	protected void initDefaultCommand() {

	}
}
