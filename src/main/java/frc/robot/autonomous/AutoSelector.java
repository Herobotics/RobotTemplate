package frc.robot.autonomous;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/* Auto Selector is used to set up the auto selection on smart dashboard */
public class AutoSelector {

  private static AutoSelector instance;

  private static Command autonomousCommand;
  private static SendableChooser<int> autonomousChooser = new SendableChooser<>();

  private static Command command;

  //Function to write the commands to the dashboard
  public static void initalize(){
    //Add all of the commands here by name and id
    autonomousChooser.addDefault("Base Line", 0);
    // addOption​(String name, int object)

    SmartDashboard.putData("Auto mode", autonomousChooser);
  }

  public static void startAuto(){
    //Make sure that the last auto stopped
    cancelAuto();
    //Turn our ID into a Command
  	switch(autonomousChooser.getSelected()){
      case 0:
        command = new BaseLine();
        break;
      default:
				System.out.println("No auto picked");
        command = null;
    }
    //Run the Command
		if (command != null){
			command.start();
		}
  }

  public static void cancelAuto(){
    if(command != null){
      command.cancel();
    }
  }
}
