package org.firstinspires.ftc.teamcode.old;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.sun.tools.corba.se.idl.constExpr.ShiftRight;

import org.firstinspires.ftc.teamcode.autos.Methods;

public class Robot {

    // Declaring DT motors
    public Motor leftFront, rightFront, leftBack, rightBack;

    public MecanumDrive dt;

    // Declare Method object?
    public Methods methods;

    // Hardware map??
    public HardwareMap hardMap;

    public Robot(){
        initRobotHardware();

    }

    public void initRobotHardware(){
        leftFront = new Motor(hardMap,"leftFront" );
        rightFront = new Motor(hardMap,"rightFront" );
        leftBack = new Motor(hardMap,"leftBack" );
        rightBack = new Motor(hardMap,"rightBack" );

        leftFront.setRunMode(Motor.RunMode.PositionControl);
        rightFront.setRunMode(Motor.RunMode.PositionControl);
        leftBack.setRunMode(Motor.RunMode.PositionControl);
        rightBack.setRunMode(Motor.RunMode.PositionControl);

        dt = new MecanumDrive(leftFront,rightFront,leftBack,rightBack);

        {
            leftFront.setPositionCoefficient(0.05);
            rightFront.setPositionCoefficient(0.05);
            leftBack.setPositionCoefficient(0.05);
            rightBack.setPositionCoefficient(0.05);
        }

        dt.driveRobotCentric(.5 ,.5,.5);



    }

}
