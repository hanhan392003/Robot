//package org.usfirst.frc.team6520.robot.commands;
//
//import org.usfirst.frc.team6520.robot.RobotMap;
//
//import edu.wpi.first.wpilibj.command.Command;
//
///**
// *
// */
//public class C_Turn extends Command {
//	double angle;
//    public C_Turn(double value) {
//    	this.angle = value;
//        // Use requires() here to declare subsystem dependencies
//        // eg. requires(chassis);
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    	double startangle = RobotMap.gyro.getAngle();
//    	double curangle=startangle;
//    	if (angle>0)
//    	{
//    		while (Math.abs(curangle-startangle)<=angle) 
//    		{
//    			RobotMap.left.set(-0.5);
//    			RobotMap.right.set(-0.5);
//    			curangle=RobotMap.gyro.getAngle();
//    		}
//    		RobotMap.left.stopMotor();
//    		RobotMap.right.stopMotor();
//    	}
//    	else if (angle<0)
//    	{
//    		while (Math.abs(curangle-startangle)>=angle) 
//    		{
//    			RobotMap.left.set(0.5);
//    			RobotMap.right.set(0.5);
//    			curangle=RobotMap.gyro.getAngle();
//    		}
//    		RobotMap.left.stopMotor();
//    		RobotMap.right.stopMotor();
//    	}
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//        return true;
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    }
//}
