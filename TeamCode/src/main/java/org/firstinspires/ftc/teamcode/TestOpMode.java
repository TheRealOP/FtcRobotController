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

        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        int ec = (int) (3609/1.167);
        leftFront.setTargetPosition(ec);
        leftBack.setTargetPosition(ec);
        rightFront.setTargetPosition(ec);
        rightBack.setTargetPosition(ec);

        leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);



        waitForStart();

        telemetry.addData("Mode", "Waiting");
        telemetry.update();

        leftFront.setPower(.5);
        leftBack.setPower(.5);
        rightFront.setPower(.5);
        rightBack.setPower(.5);

        while (opModeIsActive() && leftFront.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
        {
            telemetry.addData("encoder-fwd-left", leftFront.getCurrentPosition() + "  busy=" + leftFront.isBusy());
            telemetry.addData("encoder-fwd-right", rightFront.getCurrentPosition() + "  busy=" + rightFront.isBusy());
            telemetry.update();
            idle();
        }

        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);

        resetStartTime();

        while (opModeIsActive() && getRuntime() < 5)
        {
            telemetry.addData("encoder-fwd-left-end", leftFront.getCurrentPosition());
            telemetry.addData("encoder-fwd-right-end", rightFront.getCurrentPosition());
            telemetry.update();
            idle();
        }
/*
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



 */


    }

}
