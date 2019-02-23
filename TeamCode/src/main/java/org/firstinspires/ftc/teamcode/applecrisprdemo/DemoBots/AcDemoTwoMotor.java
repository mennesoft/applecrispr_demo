package org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.applecrisprdemo.AcRevComponents.AcREVMotor;

/**
 * Created by Riley on 10-Mar-18.
 */

public class AcDemoTwoMotor extends AcDemoBot {

    AcREVMotor leftWheel;
    AcREVMotor rightWheel;

    public AcDemoTwoMotor(HardwareMap map) {
        super(map);
        leftWheel = new AcREVMotor("left");
        rightWheel = new AcREVMotor("right");

        leftWheel.init(hardwareMap);
        rightWheel.init(hardwareMap);
        rightWheel.setDirection(false);
    }

    @Override
    void linearDrive(float power) {
        leftWheel.setPower(power);
        rightWheel.setPower(power);
    }

    @Override
    void pinwheelRotation(float power) {
        leftWheel.setPower(power);
        rightWheel.setPower(-1 * power);
    }

    @Override
    public void stop() {
        leftWheel.stop();
        rightWheel.stop();
    }
}
