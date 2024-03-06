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
            int preguntasPorRonda = 10;
            for (int i = 0; i < preguntasPorRonda; i++) {
                Random random = new Random();
                int numAleatorio = random.nextInt(82) + 1;
                System.out.println();

                switch (numAleatorio) {
                    case 1:
                        System.out.println("is the fifth generation of mobile networks. It is said to be up to 100 times faster than 4G and provide higher speed, lower latency, greater capacity and more reliability. ");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("5G")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es 5G");
                            contadorFalladas++;
                        }
                        break;
                    case 2:
                        System.out.println("An indication of a network`s capacity. The greater it is, the faster the connection.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BANDWITH")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BANDWITH");
                            contadorFalladas++;
                        }
                        break;
                    case 3:
                        System.out.println(" A form of advertising on the Internet based on an embedded image or gif file into (usually a prominent section of) a web page. In many cases, this is how the content provider is able to pay for the Internet access to supply the content.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BANNER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BANNER");
                            contadorFalladas++;
                        }
                        break;
                    case 4:
                        System.out.println("A field dealing with ways to analyze and systematically extract information from data sets that are too large or complex to be dealt with by traditional data-processing software. An example is personalized marketing.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BIG DATA")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BIG DATA");
                            contadorFalladas++;
                        }
                        break;
                    case 5:
                        System.out.println("Abbreviation of ‘BInary digiT’. At a basic level, all computer data is just a series of 0s and 1s, each of which is called ‘a bit’.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BIT")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BIT");
                            contadorFalladas++;
                        }
                        break;
                    case 6:
                        System.out.println("Technology that supports digital currency (Bitcoin, Litecoin, Ethereum, and the like) and that allows for distribution of the information, but not copying. That means each individual piece of data can only have one owner, who has the private password (a complex key) to the address on the chain, which is where their ownership is recorded. A block is a record of new transactions. When a block is completed, it’s added to the chain. These blocks are linked using cryptography");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BLOCKCHAIN")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BLOCKCHAIN");
                            contadorFalladas++;
                        }
                        break;
                    case 7:
                        System.out.println("A wireless technology set to replace cables in short-range connections. The term possibly comes from the Viking king who unified Denmark and Norway, as is its logo, which is actually the king’s initials in Nordic Runes.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BLUETOOTH")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BLUETOOTH");
                            contadorFalladas++;
                        }
                        break;
                    case 8:
                        System.out.println("A saved link to a particular webpage. Microsoft Internet Explorer calls them ‘favorites.’");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BOOKMARK")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BOOKMARK");
                            contadorFalladas++;
                        }
                        break;
                    case 9:
                        System.out.println("In Computing, to switch a computer on, allowing its operating system and programs to be loaded.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BOOT")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BOOT");
                            contadorFalladas++;
                        }
                        break;
                    case 10:
                        System.out.println("In Computing, an event in which the performance of an entire system is severely limited by a single component.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BOTTLENECK")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BOTTLENECK");
                            contadorFalladas++;
                        }
                        break;
                    case 11:
                        System.out.println("A rather vague term that refers to fast bandwidth somewhere above that of an old dial-up modem.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BROADBAND")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BROADBAND");
                            contadorFalladas++;
                        }
                        break;
                    case 12:
                        System.out.println("A program you use to look at, and navigate pages on the World Wide Web. People sometimes refer to them as ‘the Internet’, although they really only provide the means to view pages on the web via a search engine.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BROWSER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BROWSER");
                            contadorFalladas++;
                        }
                        break;
                    case 13:
                        System.out.println("In computing, a connection between components or devices connected to a PC.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BUS")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BUS");
                            contadorFalladas++;
                        }
                        break;
                    case 14:
                        System.out.println("A collection of eight bits. For large numbers, we use various prefixes: Kilo = 103 (or more precisely, 1.24 x 103), Mega = 106, Giga = 109, Tera = 1012, peta = 1015, Exa = 1018, Zetta = 1021, Yotta = 1024, Bronto = 1027 and Geop = 1030.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("BYTE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es BYTE");
                            contadorFalladas++;
                        }
                        break;
                    case 15:
                        System.out.println("In a HDD, it is an embedded RAM-like memory that can be accessed very quickly for data (as compared to having to go to the HDD, which is much slower). Also known as ‘Disk Buffer’, the bigger, the more smoothly a HDD will run.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CACHE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CACHE");
                            contadorFalladas++;
                        }
                        break;
                    case 16:
                        System.out.println("In a motherboard, a physical chip sitting somewhere on it that defines how your various components (CPU, RAM, graphics card, and so on) communicate with one another. It defines your motherboard’s most essential capabilities: supported  RAM sticks and speed, supported graphics cards, PCIe lanes and USB ports supported, and so on.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CHIPSET")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CHIPSET");
                            contadorFalladas++;
                        }
                        break;
                    case 17:
                        System.out.println("Storing and accessing of data and programs over the Internet instead of on another type of hard drive.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CLOUD COMPUTING")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CLOUD COMPUTING");
                            contadorFalladas++;
                        }
                        break;
                    case 18:
                        System.out.println("When referring to cables, a type of copper cable specially built with a metal shield and other components engineered to block signal interference. It is primarily used by cable TV companies to connect their satellite antennas to customer homes.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("COAXIAL")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es COAXIAL");
                            contadorFalladas++;
                        }
                        break;
                    case 19:
                        System.out.println("Term used to describe text that is written using the protocol of a particular language by a computer programmer.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CODE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CODE");
                            contadorFalladas++;
                        }
                        break;
                    case 20:
                        System.out.println("COder/DECoder. Referred to compression technologies that compress and decompress files either of data (ZIP), images (JPEG, GIF, PNG), audio (MP3, AAC) or video (MPEG-2, MOV, MP4, MKV). There are two kinds: lossless (produce the same exact file as the original upon decompression) and lossy.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CODEC")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CODEC");
                            contadorFalladas++;
                        }
                        break;
                    case 21:
                        System.out.println("When referring to computing, a specific instruction given to a computer application to perform some kind of task or function.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("COMMAND")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es COMMAND");
                            contadorFalladas++;
                        }
                        break;
                    case 22:
                        System.out.println("A small text file sent to your computer by a website you visited. Although at times useful, they can track your activity.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("COOKIE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es COOKIE");
                            contadorFalladas++;
                        }
                        break;
                    case 23:
                        System.out.println("Digital or virtual money in which transactions are verified and records maintained by a decentralized system. Often defined as tradable digital assets built on blockchain technology. An example is Bitcoin.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CRYPTOCURRENCY")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CRYPTOCURRENCY");
                            contadorFalladas++;
                        }
                        break;
                    case 24:
                        System.out.println("Any type of illegal activity that is undertaken (or relies heavily) on a computer, like network intrusions, identity theft and the spreading of computer viruses.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("CYBERCRIME")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es CYBERCRIME");
                            contadorFalladas++;
                        }
                        break;
                    case 25:
                        System.out.println("Relative to today's computers, information as produced, processed, stored, or transmitted by a computer.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DATA")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DATA");
                            contadorFalladas++;
                        }
                        break;
                    case 26:
                        System.out.println("The gap between those (individuals, households, businesses and geographic areas) who benefit from having a ready access to computers and the Internet, and those who do not.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DIGITAL DIVIDE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DIGITAL DIVIDE");
                            contadorFalladas++;
                        }
                        break;
                    case 27:
                        System.out.println("A technology in Microsoft’s Windows designed to enhance multimedia experience such as in 3D gaming.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DIRECTX")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DIRECTX");
                            contadorFalladas++;
                        }
                        break;
                    case 28:
                        System.out.println("In Computing, unlike memory, a more permanent store that holds files even when the computer is switched off.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DISK")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DISK");
                            contadorFalladas++;
                        }
                        break;
                    case 29:
                        System.out.println("A digital connection based on packetized data transmission that can achieve a higher bandwidth than HDMI cables. Its latest version can support 4K @ 240 Hz and 8K @ 60 Hz.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DISPLAYPORT")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DISPLAYPORT");
                            contadorFalladas++;
                        }
                        break;
                    case 30:
                        System.out.println("In Computing, to receive data from a remote system, typically a server. ‘Upload’ is its contrary.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DOWNLOAD")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DOWNLOAD");
                            contadorFalladas++;
                        }
                        break;
                    case 31:
                        System.out.println("A location, usually in a hard disk partition, labelled with a letter (e.g. CSomrient that is capable of storing and reading information.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DRIVE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DRIVE");
                            contadorFalladas++;
                        }
                        break;
                    case 32:
                        System.out.println("In Computing, a set of files that tells a hardware part how to communicate with a computer.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DRIVER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DRIVER");
                            contadorFalladas++;
                        }
                        break;
                    case 33:
                        System.out.println("Common way of connecting computers on a network with a wired connection. Typical of local area networks (LANs).");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("ETHERNET")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es ETHERNET");
                            contadorFalladas++;
                        }
                        break;
                    case 34:
                        System.out.println("Also known as ‘repeater’, a hardware device used to improve the wireless signal strength between (usually) a router and distant devices and thus enlarge the range of your WiFi network, but usually at the expense of bandwidth.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("EXTENDER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es EXTENDER");
                            contadorFalladas++;
                        }
                        break;
                    case 35:
                        System.out.println("Also known as ‘repeater’, a hardware device used to improve the wireless signal strength between (usually) a router and distant devices and thus enlarge the range of your WiFi network, but usually at the expense of bandwidth.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("EXTENDER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es EXTENDER");
                            contadorFalladas++;
                        }
                        break;
                    case 36:
                        System.out.println("Software that restricts the data allowed to flow through a network. It blocks traffic that is undesirable in some way.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("FIREWALL")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es FIREWALL");
                            contadorFalladas++;
                        }
                        break;
                    case 37:
                        System.out.println("A specific class of computer software that provides the low-level control for a device's specific hardware.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("FIRMWARE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es FIRMWARE");
                            contadorFalladas++;
                        }
                        break;
                    case 38:
                        System.out.println("In Computing, to alter deliberately a device or component’s firmware to change or update the instruction set.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("FLASH")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es FLASH");
                            contadorFalladas++;
                        }
                        break;
                    case 39:
                        System.out.println("In Computing, to gain illegal access to a computer network or system. ‘White Hats’ and ‘Black Hats’ are its practitioners.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("HACK")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es HACK");
                            contadorFalladas++;
                        }
                        break;
                    case 40:
                        System.out.println("Hash (symbol # on a phone or computer keyboard) and tag (mark). Symbol used in Twitter social network before a relevant keyword or phrase in their Tweet to categorize those Tweets and help them show more easily in Twitter search.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("HASHTAG")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es HASHTAG");
                            contadorFalladas++;
                        }
                        break;
                    case 41:
                        System.out.println("A comprehensive term for all physical and tangible parts of a PC, as distinguished from the data it contains.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("HARDWARE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es HARDWARE");
                            contadorFalladas++;
                        }
                        break;
                    case 42:
                        System.out.println("Intel’s technology to improve CPU performance by dividing its physical cores into virtual cores. AMD’s similar technology is SMT (Simultaneous Multi-Threading).");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("HYPER-THREADING")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es HYPER-THREADING");
                            contadorFalladas++;
                        }
                        break;
                    case 43:
                        System.out.println("A global computer network that includes services such as the World Wide Web, email, file transfer protocol (FTP), chat and so on. Also, the wiring that allows computers all over the world to communicate.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("INTERNET")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es INTERNET");
                            contadorFalladas++;
                        }
                        break;
                    case 44:
                        System.out.println("A private, internal Internet specific to an organization or group.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("INTRANET")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es INTRANET");
                            contadorFalladas++;
                        }
                        break;
                    case 45:
                        System.out.println("A widely-used programming language for coding web applications which has been a popular choice among developers for over two decades, with millions of Java applications in use today. Java is a multi-platform, object-oriented, and network-centered language, which can be used as a platform in itself, and is best suited for building and running mobile applications, cloud applications and chatbots. Companies such as Pinterest, Google, Airbnb, Uber and Netflix use Java.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("JAVA")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es JAVA");
                            contadorFalladas++;
                        }
                        break;
                    case 46:
                        System.out.println("Key Changer. A typically illegal software that changes the license key or serial number of a particular piece of proprietary software installed on a computer.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("KEYCHAN")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es KEYCHAN");
                            contadorFalladas++;
                        }
                        break;
                    case 47:
                        System.out.println("Key Generator. Software that generates a product license, such as a serial number, necessary to activate another software. Typically illegitimate, they are distributed by software crackers in the warez scene and many contain malware.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("KEYGEN")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es KEYGEN");
                            contadorFalladas++;
                        }
                        break;
                    case 48:
                        System.out.println("Another word for ‘seed’. In computers, the nucleus of an OS.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("KERNEL")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es KERNEL");
                            contadorFalladas++;
                        }
                        break;
                    case 49:
                        System.out.println("In Internet slang, a term describing someone who takes files from a network share, but never shares any of his/her files with anyone. For example, one who participates in P2P/torrents to download all the wanted files but never offers any in return.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("LEECH")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es LEECH");
                            contadorFalladas++;
                        }
                        break;
                    case 50:
                        System.out.println("In Computing, denoting or relating to software or hardware that has been superseded but is difficult to replace because of its wide use. The connector VGA or Windows XP may be some familiar examples.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("LEGACY")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es LEGACY");
                            contadorFalladas++;
                        }
                        break;
                    case 51:
                        System.out.println("A type of computer designed by Apple usually associated with high-powered graphic design.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MAC")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MAC");
                            contadorFalladas++;
                        }
                        break;
                    case 52:
                        System.out.println("Virus, Trojan, worm, keylogger, spyware, spam, junk, ransomware, bloatware, phishing, vishing, etc. are all terms categorized as malware, a general term for all such programs with some malicious intention.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MALWARE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MALWARE");
                            contadorFalladas++;
                        }
                        break;
                    case 53:
                        System.out.println("In Computing, the temporary storage used by a computer to carry out tasks. This is more accurately called RAM.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MEMORY")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MEMORY");
                            contadorFalladas++;
                        }
                        break;
                    case 54:
                        System.out.println("In a WiFi system, a technology usually incorporated in a router that is capable to distribute the signal more evenly and widely across a home in order to enjoy unbroken signal reception.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MESH")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MESH");
                            contadorFalladas++;
                        }
                        break;
                    case 55:
                        System.out.println("A virtual-reality space in which users can interact with a computer-generated environment and other users. An example is a Fortnite concert.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("METAVERSE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es METAVERSE");
                            contadorFalladas++;
                        }
                        break;
                    case 56:
                        System.out.println("In Computing, to run software that solves complex math problems in exchange for a certain number of bitcoins.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MINE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MINE");
                            contadorFalladas++;
                        }
                        break;
                    case 57:
                        System.out.println("A cooler way to refer to the PCB found in general-purpose PCs and other electronic devices.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MOBO")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MOBO");
                            contadorFalladas++;
                        }
                        break;
                    case 58:
                        System.out.println("Short for ‘MOdulator/DEModulator’. A hardware device used to connect a computer or router to a telephone line which provides the Digital Subscriber Line (DSL) service for connection to the Internet, which is often called DSL broadband. It usually has just two ports: one that connects to the outside world, and an Ethernet jack that connects to a computer or a router.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MODEM")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MODEM");
                            contadorFalladas++;
                        }
                        break;
                    case 59:
                        System.out.println("A self-fulfilling prophecy used in technology posed by an Intel’s CEO in 1965 to describe the historical trend of doubling every two years the number of components built in an integrated circuit.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("MOORE'S LAW")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es MOORE'S LAW");
                            contadorFalladas++;
                        }
                        break;
                    case 60:
                        System.out.println("A memory controller that reduces erase and write times in a SSD, thus extending its theoretical life.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("NAND")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es NAND");
                            contadorFalladas++;
                        }
                        break;
                    case 61:
                        System.out.println("Two or more computers that are linked in order to share resources, exchange files, or allow electronic communications. The computers on it may be linked through cables, radio waves or satellites. Two very common types include ‘Local Area Network’ (LAN) for small areas, and ‘Wide Area Network’ (WAN) for larger areas.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("NETWORK")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es NETWORK");
                            contadorFalladas++;
                        }
                        break;
                    case 62:
                        System.out.println("In Computing, an individual who is new to something, usually a videogame. Also referred to as a ‘noob’.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("NEWBIE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es NEWBIE");
                            contadorFalladas++;
                        }
                        break;
                    case 63:
                        System.out.println("A secret code to have access to a computer, network, account or file.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("PASSWORD")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es PASSWORD");
                            contadorFalladas++;
                        }
                        break;
                    case 64:
                        System.out.println("A user of a P2P transmission involved in downloading or uploading of files.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("PEER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es PEER");
                            contadorFalladas++;
                        }
                        break;
                    case 65:
                        System.out.println("Also referred to as P2P. A kind of file sharing transmission in which a group of computers are linked together with equal permissions and responsibilities for processing data. Unlike traditional client-server networking, it is not centralized so no members are designated solely to serve or to receive data.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("PEER TO PEER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es PEER TO PEER");
                            contadorFalladas++;
                        }
                        break;
                    case 66:
                        System.out.println("PICture ELement. The smallest portion of an image that a device is capable of printing or displaying. Its quantity (resolution) is expressed in SD (Standard Definition: 480p), HD (High Def: 720p), FHD (Full HD: 1080p), QHD (Quad HD), 4K, etc.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("PIXEL")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es PIXEL");
                            contadorFalladas++;
                        }
                        break;
                    case 67:
                        System.out.println("A computer general-purpose programming language often used to build websites and software, automate tasks, and analyze data. Its design philosophy emphasizes code readability, which is why is the most popular programming language. Large organizations that use Python include Wikipedia, Google, Yahoo!, NASA, Facebook, Amazon, Instagram or Spotify.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("PYTHON")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es PYTHON");
                            contadorFalladas++;
                        }
                        break;
                    case 68:
                        System.out.println("A type of computation that binds the collective properties of quantum states, such as superposition, interference and entanglement, to perform calculations.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("QUANTUM COMPUTING")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es QUANTUM COMPUTING");
                            contadorFalladas++;
                        }
                        break;
                    case 69:
                        System.out.println("A hardware device which directs data between devices in your home (via cables or wirelessly), as well as between those devices and the Internet, to which is connected through a port. They usually provide an internal web page to the LAN for device configuration and status reporting.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("ROUTER")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es ROUTER");
                            contadorFalladas++;
                        }
                        break;
                    case 70:
                        System.out.println("A small list of commands that handle a particular task like, for example, producing a message when login a particular username is not available. It may be used to automate processes and minimize the server load by performing small but useful tasks.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("SCRIPT")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es SCRIPT");
                            contadorFalladas++;
                        }
                        break;
                    case 71:
                        System.out.println("In Computing, especially in peer-to-peer (P2P) transfers, a computer (or \"peer\") that uploads one or more files on a file sharing network such as BitTorrent.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("SEED")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es SEED");
                            contadorFalladas++;
                        }
                        break;
                    case 72:
                        System.out.println("A set of instructions (program) that enable the user to interact with a computer, its hardware, or perform tasks.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("SOFTWARE")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es SOFTWARE");
                            contadorFalladas++;
                        }
                        break;
                    case 73:
                        System.out.println("In Computing, service that a company offers to users of technology products, usually in form of help.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("SUPPORT")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es SUPPORT");
                            contadorFalladas++;
                        }
                        break;
                    case 74:
                        System.out.println("In computing, a hardware device that connects multiple devices within a LAN via Ethernet cables. Unlike a hub, it learns the identities of connected devices and then only forwards data to its destination port, thus limiting the number of collisions.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("SWITCH")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es SWITCH");
                            contadorFalladas++;
                        }
                        break;
                    case 75:
                        System.out.println("In Computing, file transfer via a special file-sharing protocol (known as P2P) among a decentralized network of users in order to avoid traffic congestion and long waiting times from a server. To maximize traffic speed, files are broken into small pieces and later reunited again into large files in our computers (hence their name). Currently, such files mean more than half of the world’s Internet traffic and, since many of them are copyrighted materials, this practice often evolves into computer piracy.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("TORRENT")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es TORRENT");
                            contadorFalladas++;
                        }
                        break;
                    case 76:
                        System.out.println("In computing, hardware or software which has only the default specifications and no add-ons or changes.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("VANILLA")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es VANILLA");
                            contadorFalladas++;
                        }
                        break;
                    case 77:
                        System.out.println("Also referred to as ‘The Scene,’ it is a worldwide, underground, organized network of pirate groups specializing in obtaining and illegally releasing digital media for free before their official sale date. Allegedly, the challenge of cracking and reverse engineering complicated software is what makes it attractive for its practitioners, who generally seek recognition and prestige.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("WAREZ")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es WAREZ");
                            contadorFalladas++;
                        }
                        break;
                    case 78:
                        System.out.println("An engaging online event where a speaker, or small group of speakers, deliver a presentation to a large audience who may participate by submitting questions.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("WEBINAR")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es WEBINAR");
                            contadorFalladas++;
                        }
                        break;
                    case 79:
                        System.out.println("An application, or a component of a GUI, that enables a user to perform a function or access a service.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("WIDGET")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es WIDGET");
                            contadorFalladas++;
                        }
                        break;
                    case 80:
                        System.out.println("Hawaiian word for ‘fast’. A database for creating, browsing, and searching through information.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("WIKI")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es WIKI");
                            contadorFalladas++;
                        }
                        break;
                    case 81:
                        System.out.println("Often wrongly thought as WIreless FIdelity. Brand name for a technology to achieve a wireless connection to a network.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("WIFI")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es WIFI");
                            contadorFalladas++;
                        }
                        break;
                    case 82:
                        System.out.println("A lossless-compression file format created by Phillip Katz in 1989. It is used by compression utilities such as WinZip or 7-Zip.");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("ZIP")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es ZIP");
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