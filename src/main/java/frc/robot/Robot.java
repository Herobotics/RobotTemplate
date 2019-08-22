package frc.robot;

import frc.robot.subSystems.chassis.Chassis;
import frc.robot.subSystems.example.Example;

import frc.robot.autonomous.AutoSelector;

import frc.robot.driverStation.Controller;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * This file is used to run all modes of the robot
 * init - Initalize all subSystems and the dashboard
 * autoinit - Start the command we selected on the dashboard
 * teleinit - Stop Auto
 * autoPeriodic/telePeriodic - Run the Command scheduler
 */
public class Robot extends TimedRobot {

	@Override
	public void robotInit(){
		Controller.initalize();
		AutoSelector.initalize();
		Chassis.initalize();
		Example.initalize();
	}

	@Override
	public void autonomousInit(){
		AutoSelector.startAuto();
	}

	@Override
	public void autonomousPeriodic(){
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit(){
		AutoSelector.cancelAuto();
	}

	@Override
	public void teleopPeriodic(){
		Scheduler.getInstance().run();
	}
}
