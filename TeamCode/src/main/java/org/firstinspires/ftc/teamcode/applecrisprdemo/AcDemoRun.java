package org.firstinspires.ftc.teamcode.applecrisprdemo;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoBot;

/**
 * Created by Riley on 13-Apr-17.
 * Good luck!
 */
@Autonomous(name = "Run Demo", group = "Autonomous")
public class AcDemoRun extends LinearOpMode {
    AcDemoBot robot;

    private void initialize() {
        try {
            robot = new org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoTwoMotor(hardwareMap);
        } catch (IllegalArgumentException ignored){}
        try {
            robot = new org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoFourMotor(hardwareMap);
        } catch (IllegalArgumentException ignored){}
        try {
            robot = new org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoTricycle(hardwareMap);
        } catch (IllegalArgumentException ignored){}
    }
    /**
     * This bit of code executes when you click the "run" button on the phone to run things!
     * Thus, if you want something to happen, put it in between the curly brackets.
     * @throws InterruptedException when the process is interrupted.  Did you expect otherwise?
     */
    @Override
    public void runOpMode() throws InterruptedException {
        initialize();
        robot.stop();
        waitForStart();

        robot.driveForward(33,3);
        robot.turnLeft(50,1);
        robot.driveForward(33,3);
        robot.turnLeft(50,1);
        robot.driveForward(33,3);
        robot.turnLeft(50,1);
        robot.driveForward(33,3);
        robot.turnLeft(50,1);
        robot.stop();
    }
}
/*               H E L P F U L   T I P S !
 *               (for when you get stuck)
 * Remember to end your lines with semicolons, like this;
 * Putting anything after two slashes in the code makes the robot ignore that. //like this
 * If the robot seems to skip a command - did you tell the program to pause there for a bit before continuing? using ("sleep(a number);")
 */
