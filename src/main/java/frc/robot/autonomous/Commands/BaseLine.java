package frc.robot.autonomous.Commands;

import frc.robot.subSystems.chassis.DriveDist;
import frc.robot.AutoDistances;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BaseLine extends CommandGroup {

    public BaseLine(){
        addSequential(new DriveDist(BASELINE_DISTANCE, BASELINE_TIME_OUT));
    }
}
