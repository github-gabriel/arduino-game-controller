import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

import com.fazecast.jSerialComm.SerialPort;

import javax.swing.*;

public class Main {

    static InputStream input;
    static OutputStream output;

    static String data, button;
    static int x = 0, y = 0;
    static String[] buttons = {"A","B","C","D","E","F","K"};

    public static void main(String[] args) {

        Window window = new Window("Arduino Game Controller Test", 1280, 720, new Panel());

        SerialPort ports[] = SerialPort.getCommPorts();
        System.out.println("Select a port:");
        int i = 1;
        for (SerialPort port : ports) {
            System.out.println(i++ + ". " + port.getSystemPortName());
        }
        Scanner s = new Scanner(System.in);
        int chosenPort = s.nextInt();

        SerialPort port = ports[chosenPort - 1];
        if (port.openPort()) {
            System.out.println("Successfully opened the port. [" + port.getSystemPortName() + "]");
        } else {
            System.out.println("Unable to open the port.");
            return;
        }

        port.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);

        Scanner data = new Scanner(port.getInputStream());
        while (data.hasNextLine()) {
            String dataString;
            try {
                dataString = data.nextLine();
                if(dataString.contains("x")){
                    dataString = dataString.replace("x " , "");
                    x = Integer.parseInt(dataString);
                    dataString = "";
                }
                if(dataString.contains("y")){
                    dataString = dataString.replace("y " , "");
                    y = Integer.parseInt(dataString);
                    dataString = "";
                }
                if(Arrays.stream(buttons).anyMatch(dataString::equals)){
                    button = dataString;
                    dataString = "";
                }
                System.out.print("\rX: " + x + " Y: " + y + " Button: " + button);
                window.getPanel().update(x + 175, y, button);
                window.getPanel().repaint();
                dataString = "";
                button = "";
            } catch (Exception e) {
            }
        }
    }
}