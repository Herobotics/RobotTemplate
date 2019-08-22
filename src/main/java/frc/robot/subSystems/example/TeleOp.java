package frc.robot.subSystems.example;

import frc.robot.driverStation.Controller;

import edu.wpi.first.wpilibj.command.Command;

public class TeleOp extends Command {

    public TeleOp(){
        requires(Example.getInstance());
    }

    protected void execute(){

    }

    // Never quit teleop
    protected boolean isFinished(){
        return false;
    }

    protected void end(){

    }

    protected void interrupted(){
        end();
    }
}
