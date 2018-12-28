/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6520.robot;

import org.usfirst.frc.team6520.robot.subsystems.SS_ConveyBelt;
import org.usfirst.frc.team6520.robot.subsystems.SS_Drivebase;
import org.usfirst.frc.team6520.robot.subsystems.SS_Grab;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// gyro (if needed)
	public static ADXRS450_Gyro gyro = new ADXRS450_Gyro(Port.kOnboardCS0);
	// convey belt
	public static SS_ConveyBelt ss_conveybelt = new SS_ConveyBelt();
	public static VictorSP belt = new VictorSP(0);
	
	// drivebase
	public static SS_Drivebase ss_drivebase = new SS_Drivebase();
	public static VictorSP left = new VictorSP(2);
	public static VictorSP right = new VictorSP(1);
	
	//grab
	public static SS_Grab ss_grab = new SS_Grab();
	public static VictorSP grab = new VictorSP(3);
	public static Encoder encoder =  new Encoder(9, 8, false, EncodingType.k4X);
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
