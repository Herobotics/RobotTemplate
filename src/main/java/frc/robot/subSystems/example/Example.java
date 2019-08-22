package frc.robot.subSystems.ehassis;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Example extends Subsystem {

	private static Example instance;
	public static Example getInstance(){
		if(instance == null){
			instance = new Example();
		}
		return instance;
	}

	public Example(){

	}

	public static void initalize(){
		getInstance();
	}

	@Override
	protected void initDefaultCommand(){
		setDefaultCommand(new TeleOp());
	}
}
