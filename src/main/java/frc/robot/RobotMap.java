package frc.robot;

/* Robot Map Class is just a static class that is used to have all ports in the same place so that it is easyer to remap ports */
public class RobotMap {

	// USB (Universal Serial Bus)
	public static final int XBOX_CONTROLLER_1 = 0;

	// PWM (Pulse Width Modulation)
	public static final int DRIVE_LEFT_MOTOR1 = 0;
	public static final int DRIVE_LEFT_MOTOR2 = 1;
	public static final int DRIVE_RIGHT_MOTOR1 = 2;
	public static final int DRIVE_RIGHT_MOTOR2 = 3;

	// DIO (Digital In Out)
	// To get this number put the robot on the ground with a test program that just prints encoder distance to the console. After that push the robot in a straight line for x inches (I do like 250) then divide that by the number you got (ie. 250/13208.5)
	public static final double DRIVE_ENCODER_PULSE_RATE = 250 / 13208.5;
	public static final int DRIVE_LEFT_ENCODER1 = 0;
	public static final int DRIVE_LEFT_ENCODER2 = 1;

	public static final int DRIVE_RIGHT_ENCODER1 = 2;
	public static final int DRIVE_RIGHT_ENCODER2 = 3;

	// PCM (Pneumatics Control Module)
	public static final int INTAKE_ACTUATOR_SOLENOID = 0;
}
