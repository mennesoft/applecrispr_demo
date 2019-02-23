package org.firstinspires.ftc.teamcode.applecrisprdemo.DemoBots;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.applecrisprdemo.AcRevComponents.AcREVContinuousServo;

/**
 * Created by Jared on 10-Mar-18.
 */

public class AcDemoThreeMotor extends AcDemoBot {

    private AcREVContinuousServo leftWheel;
    private AcREVContinuousServo rightWheel;

    public AcDemoThreeMotor(HardwareMap map) {
        super(map);
        leftWheel = new AcREVContinuousServo("left");
        rightWheel = new AcREVContinuousServo("right", "tricycleRight");

        leftWheel.init(hardwareMap);
        rightWheel.init(hardwareMap);

        leftWheel.setReversed(true);
    }

    @Override
    void linearDrive(float power) {
        //power = (float) (.5 + power/2);
        leftWheel.setPower(power);
        rightWheel.setPower(power);
    }

    @Override
    void pinwheelRotation(float power) {
        //power = (float) (.5 + power/2);
        leftWheel.setPower(power);
        rightWheel.setPower(-1 * power);
    }
    @Override
    public void stop() {
        leftWheel.stop();
        rightWheel.stop();
    }
}
