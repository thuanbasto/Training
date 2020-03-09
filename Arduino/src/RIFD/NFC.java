package RIFD;

import java.io.InputStream;
import java.io.OutputStream;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;



public class NFC {
	public static void main(String[] args) throws Exception {
		SerialPort port = (SerialPort) CommPortIdentifier.getPortIdentifier("COM3").open("serial madness", 4000);
		InputStream input = port.getInputStream();
		OutputStream output = port.getOutputStream();
		port.setSerialPortParams(9600, // 9600bps
				SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
		String number = "";
		int temp = 0;
		for (;;) {
			while (input.available() > 0) {
				number += (char) (input.read());
			}
			if (number.length() >= 10) break;
		}
		temp = Integer.valueOf(number.trim());
		System.out.println(temp);
	}
}
