package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import static java.lang.Thread.sleep;

@Autonomous(name = "Test OP Mode", group = "autos")

public class TestOpMode extends LinearOpMode{

    DcMotor leftFront, rightFront, leftBack, rightBack;

    public MecanumDrive dt;

    @Override
    public void runOpMode() throws InterruptedException {
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");

        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);



        waitForStart();

        leftFront.setPower(.5);
        leftBack.setPower(.5);
        rightFront.setPower(.5);
        rightBack.setPower(.5);

        sleep(2500);

        leftFront.setPower(-.5);
        leftBack.setPower(-.5);
        rightFront.setPower(-.5);
        rightBack.setPower(-.5);

        sleep(2500);

        leftFront.setPower(0.25);
        rightFront.setPower(-0.25);
        leftBack.setPower(0.25);
        rightBack.setPower(-0.25);

        sleep(1622);

        leftFront.setPower(.5);
        leftBack.setPower(-.5);
        rightFront.setPower(-.5);
        rightBack.setPower(.5);

        sleep(2500);

        leftFront.setPower(-.5);
        leftBack.setPower(.5);
        rightFront.setPower(.5);
        rightBack.setPower(-.5);

        sleep(2500);


    }

}
