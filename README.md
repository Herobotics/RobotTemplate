# RobotTemplate

This is a template for First Team 2500 Herobotics.

This template is currently up to date with 2019 WIPLIB

# Usage

robot/Main.java
> Standard file for FRC projects. You souldn't need to touch this

robot/Robot.java
> Initialize your subsystems here inside the robotInit function

robot/RobotMap.java
> Define static variables here for all ports on all subsystems to allow easy remapping of the robot

robot/AutoDistances.java
> Define static variables here for all distance in auto to allow easy remapping of the robot

robot/Wait.java
> Command that can be used to have the robot wait during autonomous commands

robot/driverStation/GamePad.java
> Mapping for rawButton/rawAxis on xBox GamePad

robot/driverStation/Controller.java
> Class used for handling all inputs.

robot/autonomous/AutoSelector.java
> Used for building the smartdashboard selector and running/stopping autonomous commands.

robot/autonomous/Commands/
> Directory for all autonomous commands. This Directory should hold only the very top level of autonomous command groups

robot/subSystems/
> Directory for holding all subSystems and this attached commands.
