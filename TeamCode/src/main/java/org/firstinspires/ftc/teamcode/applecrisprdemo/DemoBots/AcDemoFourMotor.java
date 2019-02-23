package org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.applecrisprdemo.AcRevComponents.AcREVMotorPair;

/**
 * Created by Riley on 10-Mar-18.
 */

public class AcDemoFourMotor extends AcDemoBot {

    AcREVMotorPair leftWheel;
    AcREVMotorPair rightWheel;

    public AcDemoFourMotor(HardwareMap map) {
        super(map);
        leftWheel = new AcREVMotorPair("drive-fl:drive-bl");
        rightWheel = new AcREVMotorPair("drive-fr:drive-br");

        leftWheel.init(hardwareMap);
        rightWheel.init(hardwareMap);
        leftWheel.setOneDirection(false);
        rightWheel.setOneDirection(false);
        rightWheel.setTwoDirection(false);
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
