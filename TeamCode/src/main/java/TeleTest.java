
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "TeleTest", group = "autos")
public class TeleTest extends OpMode {
    DcMotor leftFront, rightFront, leftBack, rightBack;

    double leftWheelPower;
    double rightWheelPower;
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
        leftWheelPower = -gamepad1.left_stick_y;
        rightWheelPower = -gamepad1.right_stick_y;

        leftFront.setPower(leftWheelPower);
        leftBack.setPower(leftWheelPower);
        rightFront.setPower(rightWheelPower);
        rightBack.setPower(rightWheelPower);

        double strafePower;

        strafePower = (gamepad1.left_stick_x+gamepad1.right_stick_x)/2;

        leftFront.setPower(strafePower);
        leftBack.setPower(-strafePower);
        rightFront.setPower(-strafePower);
        rightBack.setPower(strafePower);
    }
}
