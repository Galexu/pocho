import java.util.ArrayList;
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
        int numAleatorio = 0;

        ArrayList<Integer> acertadas = new ArrayList<>(84);
        do {
            int preguntasPorRonda = 110;
            for (int i = 0; i < preguntasPorRonda; i++) {
                Random random = new Random();
                numAleatorio = random.nextInt(110) + 1;
                for (int numero : acertadas) {
                    while (numero == numAleatorio) {
                        numAleatorio = random.nextInt(110) + 1;
                    }
                }
                System.out.println();

                switch (numAleatorio) {
                    case 1:
                        System.out.println("Application framework");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An application framework is a semi-finished system that describes the relations between a family of similar systems.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es An application framework is a semi-finished system that describes the relations between a family of similar systems.");
                            contadorFalladas++;
                        }
                        break;
                    case 2:
                        System.out.println("Process view");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A process view is a way to describe a software system in terms of the tasks and processes a system performs and the way those tasks and processes interact")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A process view is a way to describe a software system in terms of the tasks and processes a system performs and the way those tasks and processes interact");
                            contadorFalladas++;
                        }
                        break;
                    case 3:
                        System.out.println("Implementation view");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An implementation view is a way to describe a software system in terms of modules of packages and layers")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is An implementation view is a way to describe a software system in terms of modules of packages and layers");
                            contadorFalladas++;
                        }
                        break;
                    case 4:
                        System.out.println("Deployment view");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A deployment view is a way to describe a software system in terms of the way software assigns tasks to physical nodes.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A deployment view is a way to describe a software system in terms of the way software assigns tasks to physical nodes.");
                            contadorFalladas++;
                        }
                        break;
                    case 5:
                        System.out.println("Conceptual view");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A conceptual view is a way to describe a software system in terms of major design elements and the interactions between those elements")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A conceptual view is a way to describe a software system in terms of major design elements and the interactions between those elements");
                            contadorFalladas++;
                        }
                        break;
                    case 6:
                        System.out.println("Programming plan");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A programming plan is a program fragment that is used to describe a common action")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es A programming plan is a program fragment that is used to describe a common action");
                            contadorFalladas++;
                        }
                        break;
                    case 7:
                        System.out.println("Module");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A module is a group of software functions that are bundled together.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A module is a group of software functions that are bundled together.");
                            contadorFalladas++;
                        }
                        break;
                    case 8:
                        System.out.println("Idiom");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An idiom is a low level pattern that is specific to a programming language and can be used to perform a basic function")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is An idiom is a low level pattern that is specific to a programming language and can be used to perform a basic function");
                            contadorFalladas++;
                        }
                        break;
                    case 9:
                        System.out.println("Design pattern");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A design pattern is a reusable solution that can be applied to commonly occurring software design problems.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A design pattern is a reusable solution that can be applied to commonly occurring software design problems.");
                            contadorFalladas++;
                        }
                        break;
                    case 10:
                        System.out.println("Software architecture");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Software architecture is the practice of viewing systems in terms of their major components and characterizing the interaction between those components.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Software architecture is the practice of viewing systems in terms of their major components and characterizing the interaction between those components.");
                            contadorFalladas++;
                        }
                        break;
                    case 11:
                        System.out.println("DSSA (Domain-Specific Software Architecture)");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("DSSA is any style of system architecture which includes a reference architecture, component library, and application configuration method.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es DSSA is any style of system architecture which includes a reference architecture, component library, and application configuration method.");
                            contadorFalladas++;
                        }
                        break;
                    case 12:
                        System.out.println("Control structure");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A control structure is a component that shows and dictates the order of execution of components.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A control structure is a component that shows and dictates the order of execution of components.");
                            contadorFalladas++;
                        }
                        break;
                    case 13:
                        System.out.println("System model");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A system model is a description of the characterization of a system as defined by its components and connectors")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A system model is a description of the characterization of a system as defined by its components and connectors");
                            contadorFalladas++;
                        }
                        break;
                    case 14:
                        System.out.println("Component");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A component is a computational element or data store used in software architecture structures.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A component is a computational element or data store used in software architecture structures.");
                            contadorFalladas++;
                        }
                        break;
                    case 15:
                        System.out.println("Connector");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A connector is a computational element that determines how components interact.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A connector is a computational element that determines how components interact.");
                            contadorFalladas++;
                        }
                        break;
                    case 16:
                        System.out.println("Abstract Data Type");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An abstract data type is a software structure that matches the structure of the original data, and whose system components are designed to maintain themselves")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es An abstract data type is a software structure that matches the structure of the original data, and whose system components are designed to maintain themselves");
                            contadorFalladas++;
                        }
                        break;
                    case 17:
                        System.out.println("Implicit Invocation");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An implicit invocation is a system in which computations are invoked by certain events rather than by interaction with the user.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is An implicit invocation is a system in which computations are invoked by certain events rather than by interaction with the user.");
                            contadorFalladas++;
                        }
                        break;
                    case 18:
                        System.out.println("Layered");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("If an architectural style is layered, it is organized by ascending functionality")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is If an architectural style is layered, it is organized by ascending functionality");
                            contadorFalladas++;
                        }
                        break;
                    case 19:
                        System.out.println("Main Program with Subroutines");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A main program with subroutines is a hierarchical system in which a top level module invokes other modules in a given order")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A main program with subroutines is a hierarchical system in which a top level module invokes other modules in a given order");
                            contadorFalladas++;
                        }
                        break;
                    case 20:
                        System.out.println("Pipes and Filters");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Pipes and filters is a style that relies on input streams and system operations to process ordered data.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Pipes and filters is a style that relies on input streams and system operations to process ordered data.");
                            contadorFalladas++;
                        }
                        break;
                    case 21:
                        System.out.println("Repository");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A repository is an architectural style designed for systems which manage a body of data with an inherent structure.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es A repository is an architectural style designed for systems which manage a body of data with an inherent structure.");
                            contadorFalladas++;
                        }
                        break;
                    case 22:
                        System.out.println("Wicked problem");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A wicked problem is a problem encountered in software design that has both a complicated cause and complicated solution, and may be the result of another problem.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A wicked problem is a problem encountered in software design that has both a complicated cause and complicated solution, and may be the result of another problem.");
                            contadorFalladas++;
                        }
                        break;
                    case 23:
                        System.out.println("Stopping rule");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A stopping rule is an indication that the solution to a problem has been reached")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A stopping rule is an indication that the solution to a problem has been reached");
                            contadorFalladas++;
                        }
                        break;
                    case 24:
                        System.out.println("Call graph");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A call graph is a graph depicting the outcome of a software design process")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A call graph is a graph depicting the outcome of a software design process");
                            contadorFalladas++;
                        }
                        break;
                    case 25:
                        System.out.println("System structure");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A system structure is the makeup of a system’s modules and how they are connected")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A system structure is the makeup of a system’s modules and how they are connected");
                            contadorFalladas++;
                        }
                        break;
                    case 26:
                        System.out.println("Abstraction");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An abstraction is a general system plan that ignores details that are irrelevant at a broad level.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es An abstraction is a general system plan that ignores details that are irrelevant at a broad level.");
                            contadorFalladas++;
                        }
                        break;
                    case 27:
                        System.out.println("Modularity");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Modularity is a way of viewing a system as a series of smaller interconnected systems.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Modularity is a way of viewing a system as a series of smaller interconnected systems.");
                            contadorFalladas++;
                        }
                        break;
                    case 28:
                        System.out.println("Cohesion");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Cohesion is the connection between the modules of a system")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Cohesion is the connection between the modules of a system");
                            contadorFalladas++;
                        }
                        break;
                    case 29:
                        System.out.println("Coupling");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Coupling is the measure of the strength of connections between modules in a system.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Coupling is the measure of the strength of connections between modules in a system.");
                            contadorFalladas++;
                        }
                        break;
                    case 30:
                        System.out.println("Information hiding");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Information hiding is a system in which modules contain information that is not likely to change, thereby protecting parts of a program from extensive modifications")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Information hiding is a system in which modules contain information that is not likely to change, thereby protecting parts of a program from extensive modifications");
                            contadorFalladas++;
                        }
                        break;
                    case 31:
                        System.out.println("Inter-modular attribute");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An inter-modular attribute is a feature or characteristic of an entire system of modules.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es An inter-modular attribute is a feature or characteristic of an entire system of modules.");
                            contadorFalladas++;
                        }
                        break;
                    case 32:
                        System.out.println("Intra-modular attributes");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An intra-modular attribute is a feature or characteristic of an individual module.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is An intra-modular attribute is a feature or characteristic of an individual module.");
                            contadorFalladas++;
                        }
                        break;
                    case 33:
                        System.out.println("Complexity");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Complexity is the measure of the amount of time and other resources required to construct or change a system")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Complexity is the measure of the amount of time and other resources required to construct or change a system");
                            contadorFalladas++;
                        }
                        break;
                    case 34:
                        System.out.println("Design method");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A design method is a set of guidelines and procedures for designing a software system.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A design method is a set of guidelines and procedures for designing a software system.");
                            contadorFalladas++;
                        }
                        break;
                    case 35:
                        System.out.println("Top-down design");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A top-down design is a method of designing software in which the engineer begins by defining the main user functions and decomposes those functions into subfunctions, until the basic operations of the software are defined")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A top-down design is a method of designing software in which the engineer begins by defining the main user functions and decomposes those functions into subfunctions, until the basic operations of the software are defined");
                            contadorFalladas++;
                        }
                        break;
                    case 36:
                        System.out.println("Bottom-up design");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A bottom-up design is a method of designing software in which the engineer begins with the software’s most basic functions and proceeds to more complicated functions, until the higherorder functions of the software have been created")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es A bottom-up design is a method of designing software in which the engineer begins with the software’s most basic functions and proceeds to more complicated functions, until the higherorder functions of the software have been created");
                            contadorFalladas++;
                        }
                        break;
                    case 37:
                        System.out.println("Functional decomposition");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Functional decomposition is a design philosophy in which a function is decomposed into a number of subfunctions.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Functional decomposition is a design philosophy in which a function is decomposed into a number of subfunctions.");
                            contadorFalladas++;
                        }
                        break;
                    case 38:
                        System.out.println("Decompose");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("To decompose a function is to split it into the subfunctions that make it up.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is To decompose a function is to split it into the subfunctions that make it up");
                            contadorFalladas++;
                        }
                        break;
                    case 39:
                        System.out.println("Subfunctions");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A subfunction is a component which combines with other subfunctions to make up a function")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A subfunction is a component which combines with other subfunctions to make up a function");
                            contadorFalladas++;
                        }
                        break;
                    case 40:
                        System.out.println("Stepwise refinement");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Stepwise refinement is a problem-solving approach in software design in which a problem is divided into smaller, more manageable sections")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Stepwise refinement is a problem-solving approach in software design in which a problem is divided into smaller, more manageable sections");
                            contadorFalladas++;
                        }
                        break;
                    case 41:
                        System.out.println("Data flow designs");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A data flow design is a plan that shows the way data will move through a system.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es A data flow design is a plan that shows the way data will move through a system.");
                            contadorFalladas++;
                        }
                        break;
                    case 42:
                        System.out.println("DFD (Data Flow Diagram)");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A DFD (Data Flow Diagram) is a graphical representation of the route that data takes as it moves through a system.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A DFD (Data Flow Diagram) is a graphical representation of the route that data takes as it moves through a system.");
                            contadorFalladas++;
                        }
                        break;
                    case 43:
                        System.out.println("Structure chart");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A structure chart is a chart that shows the functions of a system from the most complex to the most primitive.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A structure chart is a chart that shows the functions of a system from the most complex to the most primitive");
                            contadorFalladas++;
                        }
                        break;
                    case 44:
                        System.out.println("Structured Designs (SD)");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Structured Designs (SD) is the development of modules and module hierarchies with the goal of creating an optimal module structure.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Structured Designs (SD) is the development of modules and module hierarchies with the goal of creating an optimal module structure.");
                            contadorFalladas++;
                        }
                        break;
                    case 45:
                        System.out.println("Structure diagram");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A structure diagram is a diagram representing compound components in a structure")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A structure diagram is a diagram representing compound components in a structure");
                            contadorFalladas++;
                        }
                        break;
                    case 46:
                        System.out.println("Schematic logic");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Schematic logic is a code that is used in a structure diagram")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Schematic logic is a code that is used in a structure diagram");
                            contadorFalladas++;
                        }
                        break;
                    case 47:
                        System.out.println("SA (Structured Analysis)");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("SA (Structured Analysis) is a method for converting real-life requirements into software that will fulfill a specific need.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is SA (Structured Analysis) is a method for converting real-life requirements into software that will fulfill a specific need.");
                            contadorFalladas++;
                        }
                        break;
                    case 48:
                        System.out.println("JSD (Jackson System Development)");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("JSD (Jackson System Development) is a method of system development which contains three distinct phases in the development process.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is JSD (Jackson System Development) is a method of system development which contains three distinct phases in the development process.");
                            contadorFalladas++;
                        }
                        break;
                    case 49:
                        System.out.println("Modeling stage");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The modeling stage is a stage in JSD in which a description is made of the problem that the software needs to solve")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The modeling stage is a stage in JSD in which a description is made of the problem that the software needs to solve");
                            contadorFalladas++;
                        }
                        break;
                    case 50:
                        System.out.println("Network stage");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The network stage is a stage in JSD in which a system is shown as a network of communicating processes")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The network stage is a stage in JSD in which a system is shown as a network of communicating processes");
                            contadorFalladas++;
                        }
                        break;
                    case 51:
                        System.out.println("Implementation stage");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Implementation stage is a method of system development that is based on data flow and program structure.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Implementation stage is a method of system development that is based on data flow and program structure.");
                            contadorFalladas++;
                        }
                        break;
                    case 52:
                        System.out.println("JSP (Jackson Structured Programming)");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("JSP (Jackson Structured Programming) is a method of system development that is based on data flow and program structure.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is JSP (Jackson Structured Programming) is a method of system development that is based on data flow and program structure.");
                            contadorFalladas++;
                        }
                        break;
                    case 53:
                        System.out.println("Object-oriented");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("If a design is object-oriented, it uses objects, or data structures, as a basis for designing software.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is If a design is object-oriented, it uses objects, or data structures, as a basis for designing software.");
                            contadorFalladas++;
                        }
                        break;
                    case 54:
                        System.out.println("Attribute");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An attribute is a fundamental quality of something.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is An attribute is a fundamental quality of something.");
                            contadorFalladas++;
                        }
                        break;
                    case 55:
                        System.out.println("Property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A property is an identifying and descriptive characteristic or attribute, and may apply to a single entity or a relationship between entities")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A property is an identifying and descriptive characteristic or attribute, and may apply to a single entity or a relationship between entities");
                            contadorFalladas++;
                        }
                        break;
                    case 56:
                        System.out.println("Relationship");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A relationship is a property that depends on the way two entities interact.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es A relationship is a property that depends on the way two entities interact.");
                            contadorFalladas++;
                        }
                        break;
                    case 57:
                        System.out.println("State");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A state is the set of attributes of a particular object.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A state is the set of attributes of a particular object.");
                            contadorFalladas++;
                        }
                        break;
                    case 58:
                        System.out.println("Class");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A class is a group of objects that have the same set of attributes.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A class is a group of objects that have the same set of attributes.");
                            contadorFalladas++;
                        }
                        break;
                    case 59:
                        System.out.println("Booch method");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The Booch method is a software modeling language and process that is used in object-oriented software development")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The Booch method is a software modeling language and process that is used in object-oriented software development");
                            contadorFalladas++;
                        }
                        break;
                    case 60:
                        System.out.println("Fusion method");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The Fusion method is an object-oriented software development process that structures the process into analysis, design, and implementation phases.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The Fusion method is an object-oriented software development process that structures the process into analysis, design, and implementation phases.");
                            contadorFalladas++;
                        }
                        break;
                    case 61:
                        System.out.println("OMT (Object Modeling Technique)");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("OMT (Object Modeling Technique) is an object-oriented approach to software development")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es OMT (Object Modeling Technique) is an object-oriented approach to software development");
                            contadorFalladas++;
                        }
                        break;
                    case 62:
                        System.out.println("Class diagram");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A class diagram is a graph that models the relationships between nodes and depicts the decomposition of a system.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A class diagram is a graph that models the relationships between nodes and depicts the decomposition of a system.");
                            contadorFalladas++;
                        }
                        break;
                    case 63:
                        System.out.println("State diagram");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A state diagram is a graph which depicts the dynamic behavior of single objects.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A state diagram is a graph which depicts the dynamic behavior of single objects.");
                            contadorFalladas++;
                        }
                        break;
                    case 64:
                        System.out.println("Collaboration diagram");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A collaboration diagram is a graph that depicts objects in relation to a particular interaction.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A collaboration diagram is a graph that depicts objects in relation to a particular interaction.");
                            contadorFalladas++;
                        }
                        break;
                    case 65:
                        System.out.println("Interaction diagram");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An interaction diagram is a graph that depicts the sequence of messages of which a typical graph is composed.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is An interaction diagram is a graph that depicts the sequence of messages of which a typical graph is composed.");
                            contadorFalladas++;
                        }
                        break;
                    case 66:
                        System.out.println("Sequence diagram");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A sequence diagram is a graph that depicts the time ordering of events within an interaction")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es A sequence diagram is a graph that depicts the time ordering of events within an interaction");
                            contadorFalladas++;
                        }
                        break;
                    case 67:
                        System.out.println("Satisfy");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("To satisfy a requirement is to complete the necessary tasks or meet all of the expectations involved in the requirement.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is To satisfy a requirement is to complete the necessary tasks or meet all of the expectations involved in the requirement.");
                            contadorFalladas++;
                        }
                        break;
                    case 68:
                        System.out.println("Test criterion");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A test criterion is a set standard or qualification by which something is tested")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A test criterion is a set standard or qualification by which something is tested");
                            contadorFalladas++;
                        }
                        break;
                    case 69:
                        System.out.println("Fault detection");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Fault detection is the process of finding faults and exposing failures in software")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Fault detection is the process of finding faults and exposing failures in software");
                            contadorFalladas++;
                        }
                        break;
                    case 70:
                        System.out.println("Fault prevention");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Fault prevention is the process of anticipating and stopping problems by testing software multiple times during the development phase.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Fault prevention is the process of anticipating and stopping problems by testing software multiple times during the development phase.");
                            contadorFalladas++;
                        }
                        break;
                    case 71:
                        System.out.println("Oracle");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An oracle is a mechanism used to compare predicted results with the actual results of a software test")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es An oracle is a mechanism used to compare predicted results with the actual results of a software test");
                            contadorFalladas++;
                        }
                        break;
                    case 72:
                        System.out.println("Error");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("An error is a human action that produces an incorrect result in software.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is An error is a human action that produces an incorrect result in software.");
                            contadorFalladas++;
                        }
                        break;
                    case 73:
                        System.out.println("Fault");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A fault is the result of an error made by an engineer.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A fault is the result of an error made by an engineer.");
                            contadorFalladas++;
                        }
                        break;
                    case 74:
                        System.out.println("Failure");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A failure is the observable results of a fault in software.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is A failure is the observable results of a fault in software.");
                            contadorFalladas++;
                        }
                        break;
                    case 75:
                        System.out.println("Prevention model");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The prevention model is a type of software testing intended to prevent faults in design, requirements, and implementation.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The prevention model is a type of software testing intended to prevent faults in design, requirements, and implementation.");
                            contadorFalladas++;
                        }
                        break;
                    case 76:
                        System.out.println("Evaluation model");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The evaluation model is a type of software testing intended to detect requirement, design, and implementation faults")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es The evaluation model is a type of software testing intended to detect requirement, design, and implementation faults");
                            contadorFalladas++;
                        }
                        break;
                    case 77:
                        System.out.println("Demonstration model");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The demonstration model is a type of software testing which ensures that software satisfies its intended purpose")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The demonstration model is a type of software testing which ensures that software satisfies its intended purpose.");
                            contadorFalladas++;
                        }
                        break;
                    case 78:
                        System.out.println("Destruction model");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The destruction model is a type of software testing intended to detect implementation faults in a new piece of software")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The destruction model is a type of software testing intended to detect implementation faults in a new piece of software");
                            contadorFalladas++;
                        }
                        break;
                    case 79:
                        System.out.println("Static analysis");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Static analysis is a type of software testing in which a program’s structure and components are examined without being executed.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Static analysis is a type of software testing in which a program’s structure and components are examined without being executed.");
                            contadorFalladas++;
                        }
                        break;
                    case 80:
                        System.out.println("Dynamic analysis");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Dynamic analysis is a type of software testing in which a program is executed and the results of this execution are examined.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Dynamic analysis is a type of software testing in which a program is executed and the results of this execution are examined.");
                            contadorFalladas++;
                        }
                        break;
                    case 81:
                        System.out.println("Error-based testing");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Error-based testing is a software testing technique that detects common errors made by humans")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Error-based testing is a software testing technique that detects common errors made by humans");
                            contadorFalladas++;
                        }
                        break;
                    case 82:
                        System.out.println("Scenario-based evaluation");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Scenario-based evaluation is a model of software testing which is guided by simulations of common use scenarios")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Scenario-based evaluation is a model of software testing which is guided by simulations of common use scenarios.");
                            contadorFalladas++;
                        }
                        break;
                    case 83:
                        System.out.println("Black-box testing");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Black-box testing is a software testing technique in which testing criteria are developed specifically for a particular piece of software")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Black-box testing is a software testing technique in which testing criteria are developed specifically for a particular piece of software");
                            contadorFalladas++;
                        }
                        break;
                    case 84:
                        System.out.println("White-box testing");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("White-box testing is a software testing technique which examines the internal logical structure of software")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is White-box testing is a software testing technique which examines the internal logical structure of software.");
                            contadorFalladas++;
                        }
                        break;
                    case 85:
                        System.out.println("Fault-based testing");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Fault-based testing is a software testing technique that focuses primarily on testing for faults")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Fault-based testing is a software testing technique that focuses primarily on testing for faults.");
                            contadorFalladas++;
                        }
                        break;
                    case 86:
                        System.out.println("Fagan inspection");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("A Fagan inspection is a process in which a team of engineers manually inspects the code of a piece of software")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es A Fagan inspection is a process in which a team of engineers manually inspects the code of a piece of software");
                            contadorFalladas++;
                        }
                        break;
                    case 87:
                        System.out.println("Stepwise abstraction");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Stepwise abstraction is a technique for analyzing software in which all of the code is examined, from the most primitive to the most abstract.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Stepwise abstraction is a technique for analyzing software in which all of the code is examined, from the most primitive to the most abstract.");
                            contadorFalladas++;
                        }
                        break;
                    case 88:
                        System.out.println("Peer review");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Peer review is a practice in which engineers read the programs of other engineers to identify faults or inadequacies in programs")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Peer review is a practice in which engineers read the programs of other engineers to identify faults or inadequacies in programs");
                            contadorFalladas++;
                        }
                        break;
                    case 89:
                        System.out.println("Proof of correctness");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Proof of correctness is a process which formally states a program’s specification and proves that the program meets that specification")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Proof of correctness is a process which formally states a program’s specification and proves that the program meets that specification.");
                            contadorFalladas++;
                        }
                        break;
                    case 90:
                        System.out.println("Coverage-based testing");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Coverage-based testing is a model of software testing in which the adequacy of a test is determined by the percentage of the software that is examined.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is Coverage-based testing is a model of software testing in which the adequacy of a test is determined by the percentage of the software that is examined.");
                            contadorFalladas++;
                        }
                        break;
                    case 91:
                        System.out.println("Test adequacy criteria");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("Test adequacy criteria are sets of requirements that measure the effectiveness of a software testing process.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es Test adequacy criteria are sets of requirements that measure the effectiveness of a software testing process.");
                            contadorFalladas++;
                        }
                        break;
                    case 92:
                        System.out.println("Complexity property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The complexity property is a property of test adequacy that states that the complexity of a program directly relates to the complexity required of its test sets.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The complexity property is a property of test adequacy that states that the complexity of a program directly relates to the complexity required of its test sets.");
                            contadorFalladas++;
                        }
                        break;
                    case 93:
                        System.out.println("Inadequate empty set");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The inadequate empty set property is a property of test adequacy that states that an empty set is not an adequate test set for any program")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The inadequate empty set property is a property of test adequacy that states that an empty set is not an adequate test set for any program");
                            contadorFalladas++;
                        }
                        break;
                    case 94:
                        System.out.println("Statement coverage property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The statement coverage property is a property of test adequacy that states that every possible action of a program should be executed by its test sets")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The statement coverage property is a property of test adequacy that states that every possible action of a program should be executed by its test sets.");
                            contadorFalladas++;
                        }
                        break;
                    case 95:
                        System.out.println("Antiextensionality property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The antiextensionality property is a property of test adequacy that states that programs need different types of testing even if they have similar names or functions.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The antiextensionality property is a property of test adequacy that states that programs need different types of testing even if they have similar names or functions.");
                            contadorFalladas++;
                        }
                        break;
                    case 96:
                        System.out.println("Renaming property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The renaming property is a property of test adequacy that states that two programs that differ only in unimportant ways can be tested with the same test sets.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es The renaming property is a property of test adequacy that states that two programs that differ only in unimportant ways can be tested with the same test sets.");
                            contadorFalladas++;
                        }
                        break;
                    case 97:
                        System.out.println("General multiple change property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The general multiple change property is a property of test adequacy that states that programs with the same structure and dataflow characteristics should still be tested on different criteria")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The general multiple change property is a property of test adequacy that states that programs with the same structure and dataflow characteristics should still be tested on different criteria.");
                            contadorFalladas++;
                        }
                        break;
                    case 98:
                        System.out.println("Applicability property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The non-exhausting applicability property is a property of test adequacy criteria that states that a criterion does not require exhaustive testing in all circumstances")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The non-exhausting applicability property is a property of test adequacy criteria that states that a criterion does not require exhaustive testing in all circumstances");
                            contadorFalladas++;
                        }
                        break;
                    case 99:
                        System.out.println("Non-exhausting applicability property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The non-exhausting applicability property is a property of test adequacy criteria that states that a criterion does not require exhaustive testing in all circumstances")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The non-exhausting applicability property is a property of test adequacy criteria that states that a criterion does not require exhaustive testing in all circumstances.");
                            contadorFalladas++;
                        }
                        break;
                    case 100:
                        System.out.println("Antidecomposition property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The antidecomposition property is a property of test adequacy that states that components that were tested as part of a whole should still be tested alone")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta es The antidecomposition property is a property of test adequacy that states that components that were tested as part of a whole should still be tested alone");
                            contadorFalladas++;
                        }
                        break;
                    case 101:
                        System.out.println("Anticomposition property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The anticomposition property is a property of test adequacy that states that components that were tested alone should still be tested when assembled as a whole")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The anticomposition property is a property of test adequacy that states that components that were tested alone should still be tested when assembled as a whole.");
                            contadorFalladas++;
                        }
                        break;
                    case 102:
                        System.out.println("Monotonicity property");
                        System.out.print("Di la respuesta: ");
                        respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("The monotonicity property is a property of test adequacy criteria that states that additional testing can be performed even after a program has been adequately tested.")) {
                            System.out.println("Correcto");
                            contadorAcertadas++;
                            acertadas.add(numAleatorio);
                        } else {
                            System.out.println("Incorrecto, la respuesta correcta is The monotonicity property is a property of test adequacy criteria that states that additional testing can be performed even after a program has been adequately tested.");
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