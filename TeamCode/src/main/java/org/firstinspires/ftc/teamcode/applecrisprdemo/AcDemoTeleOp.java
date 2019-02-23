package org.firstinspires.ftc.teamcode.applecrisprdemo;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoBot;

/**
 * Created by Riley on 13-Apr-17.
 *
 * Make sure to tell the code what your robot name is! (line 24ish)
 * Good luck!
 */

@TeleOp(name = "Run Demo TeleOp", group = "TeleOp")
public class AcDemoTeleOp extends OpMode {

    /**
     * This bit of code executes when you click the "init" button on the phone to run things!
     * Thus, if you want something to happen, put it in between the curly brackets.
     *
     */

    AcDemoBot robot;

    @Override
    public void init() {
        try {
            robot = new org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoTwoMotor(hardwareMap);
        }
        catch (IllegalArgumentException ignored){}
        try {
            robot = new org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoFourMotor(hardwareMap);
        }
        catch (IllegalArgumentException ignored){}
        try {
            robot = new org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots.AcDemoTricycle(hardwareMap);
        }
        catch (IllegalArgumentException ignored){}
    }

    private String robotType = "UNASSIGNED";

    @Override
    public void loop() {
        //Driving
        if (gamepad1.b){
            robot.stop();
        } else if (gamepad1.right_trigger > 0.1){
            robot.turnLeft((int)(gamepad1.right_trigger * 100), 0.05f);
        } else if (gamepad1.left_trigger > 0.1){
            robot.turnRight((int)(gamepad1.left_trigger * 100), 0.05f);
        } else if (gamepad1.right_stick_y > 0.1){
            robot.driveBackward((int)(gamepad1.right_stick_y * 100), 0.05f);
        } else if (gamepad1.right_stick_y < 0.1){
            robot.driveForward((int)(gamepad1.right_stick_y * -100), 0.05f);
        }
        telemetry.addData("gamepad1.right_stick_y",gamepad1.right_stick_y);
        telemetry.update();
    }
}


/*               H E L P F U L   T I P S !
 *               (for when you get stuck)
 * Remember to end your lines with semicolons, like this;
 * Putting anything after two slashes in the code makes the robot ignore that. //like this
 * If the robot seems to skip a command - did you tell the program to pause there for a bit before continuing? using ("sleep(a number);")
 */