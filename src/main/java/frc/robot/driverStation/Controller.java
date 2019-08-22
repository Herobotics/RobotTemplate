package frc.robot.driverStation;

import frc.robot.RobotMap.java;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subSystems.chassis.InvertDrive;
import frc.robot.subSystems.panel.ToggleActuator;
import frc.robot.subSystems.panel.ToggleExtender;

/* Controller class will be used to hold all of the controllers and get the values from them */

public class Controller {

	private static Controller instance;
	public static Controller getInstance(){
		if (instance == null){
			instance = new Controller();
		}
		return instance;
	}

	private Joystick pilot;

	@SuppressWarnings("resource")
	public Controller(){
		pilot = new Joystick(RobotMap.XBOX_CONTROLLER_1);

		// new JoystickButton(pilot, GamePad.Button.A).whenPressed(new ToggleActuator());
	}

	//Create the instance and craete the dashboard
	public static void initalize(){
		getInstance();
		SmartDashboard.putNumber("Chassis Move", 0);
		SmartDashboard.putNumber("Chassis Rotation", 0);
	}

	// Function to remove the controller not homing properly
	public double handleDeadband(double val, double deadband){
		if (Math.abs(val) > deadband){
			return val;
		}
		return 0;
	}

	// Function to remove the controller not homing properly
	public double handleDeadband(double val){
		return handleDeadband(val, 0.1);
	}

	public double getChassisTurn(){
		double value = handleDeadband(pilot.getRawAxis(GamePad.Axis.LEFT_X));
		SmartDashboard.putNumber("Chassis Rotation", value);
		return value;
	}

	public double getChassisMove(){
		double value = handleDeadband(pilot.getRawAxis(GamePad.Axis.LEFT_Y));
		SmartDashboard.putNumber("Chassis Move", value);

		value *= -1;
		return value;
	}
}
