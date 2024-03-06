import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        String continuar;
        int contadorTotal = 0;
        int contadorAcertadas = 0;
        int contadorFalladas = 0;

        do {
            int preguntasPorRonda = 110;
            for (int i = 0; i < preguntasPorRonda; i++) {
                Random random = new Random();
                int numAleatorio = random.nextInt(110) + 1;
                System.out.println();

                switch (numAleatorio) {
                    case 1:
                        System.out.println("ADSL");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Asymmetric Digital Subscriber Line")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Asymmetric Digital Subscriber Line");
                            contadorFalladas++;
                        }
                        break;
                    case 2:
                        System.out.println("AI");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Artificial Intelligence")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Artificial Intelligence");
                            contadorFalladas++;
                        }
                        break;
                    case 3:
                        System.out.println("API");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Application Programming Interface")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Application Programming Interface");
                            contadorFalladas++;
                        }
                        break;
                    case 4:
                        System.out.println("APU");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Accelerated Processing Unit")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Accelerated Processing Unit");
                            contadorFalladas++;
                        }
                        break;
                    case 5:
                        System.out.println("AR");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Augmented Reality")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Augmented Reality");
                            contadorFalladas++;
                        }
                        break;
                    case 6:
                        System.out.println("AV");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("AntiVirus")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es AntiVirus");
                            contadorFalladas++;
                        }
                        break;
                    case 7:
                        System.out.println("BIOS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Basic Input-Output System")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Basic Input-Output System");
                            contadorFalladas++;
                        }
                        break;
                    case 8:
                        System.out.println("BIT");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BInary digiT")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BInary digiT");
                            contadorFalladas++;
                        }
                        break;
                    case 9:
                        System.out.println("BSoD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Blue Screen of Death")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Blue Screen of Death");
                            contadorFalladas++;
                        }
                        break;
                    case 10:
                        System.out.println("BTC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BiTCoin")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BiTCoin");
                            contadorFalladas++;
                        }
                        break;
                    case 11:
                        System.out.println("BYOD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Bring Your Own Device")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Bring Your Own Device");
                            contadorFalladas++;
                        }
                        break;
                    case 12:
                        System.out.println("CAPTCHA");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Completely Automated Public Turing test to tell Computers and Humans Apart")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Completely Automated Public Turing test to tell Computers and Humans Apart");
                            contadorFalladas++;
                        }
                        break;
                    case 13:
                        System.out.println("CD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Compact Disc")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Compact Disc");
                            contadorFalladas++;
                        }
                        break;
                    case 14:
                        System.out.println("CD-ROM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CD Read-Only Memory")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CD Read-Only Memory");
                            contadorFalladas++;
                        }
                        break;
                    case 15:
                        System.out.println("CEO");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Chief Executive Officer")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Chief Executive Officer");
                            contadorFalladas++;
                        }
                        break;
                    case 16:
                        System.out.println("ChatGPT");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Chat Generative Pre-Trained Transformer")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Chat Generative Pre-Trained Transformer");
                            contadorFalladas++;
                        }
                        break;
                    case 17:
                        System.out.println("CLI");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Command Line Interface")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Command Line Interface");
                            contadorFalladas++;
                        }
                        break;
                    case 18:
                        System.out.println("CPU");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Central Processing Unit")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Central Processing Unit");
                            contadorFalladas++;
                        }
                        break;
                    case 19:
                        System.out.println("DDR");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Double Data Rate")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Double Data Rate");
                            contadorFalladas++;
                        }
                        break;
                    case 20:
                        System.out.println("DIMM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Dual In-Line Memory Module")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Dual In-Line Memory Module");
                            contadorFalladas++;
                        }
                        break;
                    case 21:
                        System.out.println("DLC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DownLoadable Content")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DownLoadable Content");
                            contadorFalladas++;
                        }
                        break;
                    case 22:
                        System.out.println("DRM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Digital Rights Management")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Digital Rights Management");
                            contadorFalladas++;
                        }
                        break;
                    case 23:
                        System.out.println("DVD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Digital Versatile Disc")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Digital Versatile Disc");
                            contadorFalladas++;
                        }
                        break;
                    case 24:
                        System.out.println("DVI");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Digital Video Interface")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Digital Video Interface");
                            contadorFalladas++;
                        }
                        break;
                    case 25:
                        System.out.println("EOL");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("End Of Life")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es End Of Life");
                            contadorFalladas++;
                        }
                        break;
                    case 26:
                        System.out.println("ETA");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Estimated Time of Arrival")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Estimated Time of Arrival");
                            contadorFalladas++;
                        }
                        break;
                    case 27:
                        System.out.println("EULA");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("End-User License Agreement")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es End-User License Agreement");
                            contadorFalladas++;
                        }
                        break;
                    case 28:
                        System.out.println("FAQ");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Frequently Asked Questions")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Frequently Asked Questions");
                            contadorFalladas++;
                        }
                        break;
                    case 29:
                        System.out.println("FOMO");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Fear Of Missing Out")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Fear Of Missing Out");
                            contadorFalladas++;
                        }
                        break;
                    case 30:
                        System.out.println("FSB");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Front Side Bus")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Front Side Bus");
                            contadorFalladas++;
                        }
                        break;
                    case 31:
                        System.out.println("FTP");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("File Transfer Protocol")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es File Transfer Protocol");
                            contadorFalladas++;
                        }
                        break;
                    case 32:
                        System.out.println("FTTH");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Fiber To The Home")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Fiber To The Home");
                            contadorFalladas++;
                        }
                        break;
                    case 33:
                        System.out.println("GIF");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Graphics Interchange Format")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Graphics Interchange Format");
                            contadorFalladas++;
                        }
                        break;
                    case 34:
                        System.out.println("GPU");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Graphics Processing Unit")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Graphics Processing Unit");
                            contadorFalladas++;
                        }
                        break;
                    case 35:
                        System.out.println("GUI");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Graphical User Interface")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Graphical User Interface");
                            contadorFalladas++;
                        }
                        break;
                    case 36:
                        System.out.println("HD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("High Definition")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es High Definition");
                            contadorFalladas++;
                        }
                        break;
                    case 37:
                        System.out.println("HDD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Hard Disk Drive")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Hard Disk Drive");
                            contadorFalladas++;
                        }
                        break;
                    case 38:
                        System.out.println("HDMI");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("High-Definition Multimedia Interface")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es High-Definition Multimedia Interface");
                            contadorFalladas++;
                        }
                        break;
                    case 39:
                        System.out.println("HTML");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Hyper-Text Mark-up Language")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Hyper-Text Mark-up Language");
                            contadorFalladas++;
                        }
                        break;
                    case 40:
                        System.out.println("I/O");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Input/Output")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Input/Output");
                            contadorFalladas++;
                        }
                        break;
                    case 41:
                        System.out.println("IaaS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Infrastructure as a Service")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Infrastructure as a Service");
                            contadorFalladas++;
                        }
                        break;
                    case 42:
                        System.out.println("ICT");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Information and Communication Technologies")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Information and Communication Technologies");
                            contadorFalladas++;
                        }
                        break;
                    case 43:
                        System.out.println("ID10T");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Eye Dee Ten Tee")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Eye Dee Ten Tee");
                            contadorFalladas++;
                        }
                        break;
                    case 44:
                        System.out.println("IDE");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Integrated Development Environment")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Integrated Development Environment");
                            contadorFalladas++;
                        }
                        break;
                    case 45:
                        System.out.println("IEEE");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Institute of Electrical and Electronics Engineers")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Institute of Electrical and Electronics Engineers");
                            contadorFalladas++;
                        }
                        break;
                    case 46:
                        System.out.println("IoT");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The Internet of Things")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es The Internet of Things");
                            contadorFalladas++;
                        }
                        break;
                    case 47:
                        System.out.println("IP");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Internet Protocol")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Internet Protocol");
                            contadorFalladas++;
                        }
                        break;
                    case 48:
                        System.out.println("ISO");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("International Organization for Standardization")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es International Organization for Standardization");
                            contadorFalladas++;
                        }
                        break;
                    case 49:
                        System.out.println("ISP");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Internet Service Provider")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Internet Service Provider");
                            contadorFalladas++;
                        }
                        break;
                    case 50:
                        System.out.println("IT");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Information Technologies")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Information Technologies");
                            contadorFalladas++;
                        }
                        break;
                    case 51:
                        System.out.println("JPEG");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Joint Photographic Experts Group")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Joint Photographic Experts Group");
                            contadorFalladas++;
                        }
                        break;
                    case 52:
                        System.out.println("LAN");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Local Area Network")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Local Area Network");
                            contadorFalladas++;
                        }
                        break;
                    case 53:
                        System.out.println("LASER");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Light Amplification by Stimulated Emission of Radiation")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Light Amplification by Stimulated Emission of Radiation");
                            contadorFalladas++;
                        }
                        break;
                    case 54:
                        System.out.println("LCD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Liquid Crystal Display")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Liquid Crystal Display");
                            contadorFalladas++;
                        }
                        break;
                    case 55:
                        System.out.println("LED");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Light-Emitting Diode")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Light-Emitting Diode");
                            contadorFalladas++;
                        }
                        break;
                    case 56:
                        System.out.println("MBR");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Master Boot Record")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Master Boot Record");
                            contadorFalladas++;
                        }
                        break;
                    case 57:
                        System.out.println("MIPS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Million Instructions per Second")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Million Instructions per Second");
                            contadorFalladas++;
                        }
                        break;
                    case 58:
                        System.out.println("MOUSE");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Manually-Operated User-Selection Equipment")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Manually-Operated User-Selection Equipment");
                            contadorFalladas++;
                        }
                        break;
                    case 59:
                        System.out.println("MP3");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MPEG Audio Layer III")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MPEG Audio Layer III");
                            contadorFalladas++;
                        }
                        break;
                    case 60:
                        System.out.println("MS-DOS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MicroSoft Disk Operating System")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MicroSoft Disk Operating System");
                            contadorFalladas++;
                        }
                        break;
                    case 61:
                        System.out.println("MTBF");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Mean Time Between Failures")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Mean Time Between Failures");
                            contadorFalladas++;
                        }
                        break;
                    case 62:
                        System.out.println("NAS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Network-Attached Storage")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Network-Attached Storage");
                            contadorFalladas++;
                        }
                        break;
                    case 63:
                        System.out.println("NFC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Near-Field Communication")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Near-Field Communication");
                            contadorFalladas++;
                        }
                        break;
                    case 64:
                        System.out.println("NFT");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Non-fungible Token")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Non-fungible Token");
                            contadorFalladas++;
                        }
                        break;
                    case 65:
                        System.out.println("NPC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Non-Playable Character")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Non-Playable Character");
                            contadorFalladas++;
                        }
                        break;
                    case 66:
                        System.out.println("NTFS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("New Technology File System")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es New Technology File System");
                            contadorFalladas++;
                        }
                        break;
                    case 67:
                        System.out.println("NVMe");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Non-Volatile Memory express")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Non-Volatile Memory express");
                            contadorFalladas++;
                        }
                        break;
                    case 68:
                        System.out.println("OC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("OverClock")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es OverClock");
                            contadorFalladas++;
                        }
                        break;
                    case 69:
                        System.out.println("OEM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Original Equipment Manufacturer")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Original Equipment Manufacturer");
                            contadorFalladas++;
                        }
                        break;
                    case 70:
                        System.out.println("ONT");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Optical Network Terminal")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Optical Network Terminal");
                            contadorFalladas++;
                        }
                        break;
                    case 71:
                        System.out.println("OS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Operating System")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Operating System");
                            contadorFalladas++;
                        }
                        break;
                    case 72:
                        System.out.println("PaaS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Platform as a Service")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Platform as a Service");
                            contadorFalladas++;
                        }
                        break;
                    case 73:
                        System.out.println("PC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Personal Computer")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Personal Computer");
                            contadorFalladas++;
                        }
                        break;
                    case 74:
                        System.out.println("PCB");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Printed Circuit Board")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Printed Circuit Board");
                            contadorFalladas++;
                        }
                        break;
                    case 75:
                        System.out.println("PCI");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Payment Card Industry")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Payment Card Industry");
                            contadorFalladas++;
                        }
                        break;
                    case 76:
                        System.out.println("PCIe");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Peripheral Component Interconnect Express")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Peripheral Component Interconnect Express");
                            contadorFalladas++;
                        }
                        break;
                    case 77:
                        System.out.println("PDF");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Portable Document Format")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Portable Document Format");
                            contadorFalladas++;
                        }
                        break;
                    case 78:
                        System.out.println("PEBKAC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Problem Exists Between Keyboard and Chair")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Problem Exists Between Keyboard and Chair");
                            contadorFalladas++;
                        }
                        break;
                    case 79:
                        System.out.println("PLC");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Power Line Communication")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Power Line Communication");
                            contadorFalladas++;
                        }
                        break;
                    case 80:
                        System.out.println("PS/2");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Personal System/2")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Personal System/2");
                            contadorFalladas++;
                        }
                        break;
                    case 81:
                        System.out.println("PSU");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Power Supply Unit")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Power Supply Unit");
                            contadorFalladas++;
                        }
                        break;
                    case 82:
                        System.out.println("PUP");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Potentially Unwanted Program")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Potentially Unwanted Program");
                            contadorFalladas++;
                        }
                        break;
                    case 83:
                        System.out.println("QR CODE");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Quick Response code")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Quick Response code");
                            contadorFalladas++;
                        }
                        break;
                    case 84:
                        System.out.println("RAID");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Redundant Array of Independent Disks")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Redundant Array of Independent Disks");
                            contadorFalladas++;
                        }
                        break;
                    case 85:
                        System.out.println("RAM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Random-Access Memory")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Random-Access Memory");
                            contadorFalladas++;
                        }
                        break;
                    case 86:
                        System.out.println("RJ45");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Registered Jack-45")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Registered Jack-45");
                            contadorFalladas++;
                        }
                        break;
                    case 87:
                        System.out.println("RMA");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Return Merchandise Authorization")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Return Merchandise Authorization");
                            contadorFalladas++;
                        }
                        break;
                    case 88:
                        System.out.println("ROM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Read-Only Memory")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Read-Only Memory");
                            contadorFalladas++;
                        }
                        break;
                    case 89:
                        System.out.println("RTFM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Read The F*** Manual")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Read The F*** Manual");
                            contadorFalladas++;
                        }
                        break;
                    case 90:
                        System.out.println("SaaS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Software as a Service")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Software as a Service");
                            contadorFalladas++;
                        }
                        break;
                    case 91:
                        System.out.println("SATA");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Serial Advanced Technology Attachment")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Serial Advanced Technology Attachment");
                            contadorFalladas++;
                        }
                        break;
                    case 92:
                        System.out.println("SEO");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Search Engine Optimization")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Search Engine Optimization");
                            contadorFalladas++;
                        }
                        break;
                    case 93:
                        System.out.println("SMART");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Self-Monitoring Analysis And Reporting Technology")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Self-Monitoring Analysis And Reporting Technology");
                            contadorFalladas++;
                        }
                        break;
                    case 94:
                        System.out.println("SO-DIMM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Small Outline Dual In-Line Memory Module")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Small Outline Dual In-Line Memory Module");
                            contadorFalladas++;
                        }
                        break;
                    case 95:
                        System.out.println("SPOF");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Single Point of Failure")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Single Point of Failure");
                            contadorFalladas++;
                        }
                        break;
                    case 96:
                        System.out.println("SSD");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Solid State Drive")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Solid State Drive");
                            contadorFalladas++;
                        }
                        break;
                    case 97:
                        System.out.println("TBW");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("TeraBytes Written")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es TeraBytes Written");
                            contadorFalladas++;
                        }
                        break;
                    case 98:
                        System.out.println("TDP");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Thermal Design Power")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Thermal Design Power");
                            contadorFalladas++;
                        }
                        break;
                    case 99:
                        System.out.println("TPM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Trusted Platform Module")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Trusted Platform Module");
                            contadorFalladas++;
                        }
                        break;
                    case 100:
                        System.out.println("UEFI");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Unified Extensible Firmware Interface")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Unified Extensible Firmware Interface");
                            contadorFalladas++;
                        }
                        break;
                    case 101:
                        System.out.println("UPC BARCODE");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Universal Product Code")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Universal Product Code");
                            contadorFalladas++;
                        }
                        break;
                    case 102:
                        System.out.println("UPS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Uninterruptible Power Supply")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Uninterruptible Power Supply");
                            contadorFalladas++;
                        }
                        break;
                    case 103:
                        System.out.println("USB");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Universal Serial Bus")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Universal Serial Bus");
                            contadorFalladas++;
                        }
                        break;
                    case 104:
                        System.out.println("VGA");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Video Graphics Array")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Video Graphics Array");
                            contadorFalladas++;
                        }
                        break;
                    case 105:
                        System.out.println("VPN");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Virtual Private Network")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Virtual Private Network");
                            contadorFalladas++;
                        }
                        break;
                    case 106:
                        System.out.println("VR");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Virtual Reality")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Virtual Reality");
                            contadorFalladas++;
                        }
                        break;
                    case 107:
                        System.out.println("VRAM");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Video Random Access Memory")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Video Random Access Memory");
                            contadorFalladas++;
                        }
                        break;
                    case 108:
                        System.out.println("WIMP");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Windows, Icons, Menus and Pointer")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Windows, Icons, Menus and Pointer");
                            contadorFalladas++;
                        }
                        break;
                    case 109:
                        System.out.println("WPS");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("WiFi Protected Setup")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es WiFi Protected Setup");
                            contadorFalladas++;
                        }
                        break;
                    case 110:
                        System.out.println("WWW");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("World Wide Web")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es World Wide Web");
                            contadorFalladas++;
                        }
                        break;
                }
                contadorTotal++;
            }
            System.out.print("¿Quieres otras " + preguntasPorRonda + " rondas ? (y/n): ");
            continuar = sc.nextLine();
        } while (!continuar.equals("n"));
        System.out.println("De un total de " + contadorTotal + " preguntas, has acertado " + contadorAcertadas + " y has fallado " + contadorFalladas);
    }
}