package org.firstinspires.ftc.teamcode.old;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "TeleTestTwoMK2", group = "autos")
public class TeleTestTwoMK2 extends OpMode {
    DcMotor leftFront, rightFront, leftBack, rightBack;

    @Override
    public void init() {
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");

        leftFront.setDirection(DcMotor.Direction.REVERSE);
        leftBack.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        double forwardPower = gamepad1.right_trigger;
        double backwardsPower = -gamepad1.left_trigger;
        double wheelPower = forwardPower + backwardsPower;

        leftFront.setPower(wheelPower);
        leftBack.setPower(wheelPower);
        rightFront.setPower(wheelPower);
        rightBack.setPower(wheelPower);

        double turnPower = gamepad1.left_stick_x;
        double newWheelPower;


            double strafePower;

            strafePower = (gamepad1.right_stick_x);

            leftFront.setPower(strafePower);
            leftBack.setPower(-strafePower);
            rightFront.setPower(-strafePower);
            rightBack.setPower(strafePower);
        }
    }

