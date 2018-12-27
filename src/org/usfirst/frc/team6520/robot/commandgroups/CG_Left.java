package org.usfirst.frc.team6520.robot.commandgroups;

import org.usfirst.frc.team6520.robot.commands.C_Backward;
import org.usfirst.frc.team6520.robot.commands.C_Forward;
import org.usfirst.frc.team6520.robot.commands.C_Grab;
import org.usfirst.frc.team6520.robot.commands.C_Roll;
import org.usfirst.frc.team6520.robot.commands.C_TurnLeft;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CG_Left extends CommandGroup {

    public CG_Left() {
    	addSequential(new C_Roll());
    	addSequential(new C_TurnLeft(3));
    	addSequential(new C_Forward(3));
    	addSequential(new C_Backward(3));
    	addSequential(new C_TurnLeft(3));
    	addSequential(new C_Forward(3));
    	addSequential(new C_Grab(3));
    	addSequential(new C_Backward(5));
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
