import javax.swing.JOptionPane;
/**Clase prinipal base de control
 * @author Yovanny Valderrama
 */
public class ControlBase {

    public static void main(String[] args) {
        menu();
        
    }
   
    static void spacecraftCreated(){
        Spacecraft probe1 = new Spacecraft("SondaI", 4, 3400, 40300 );
        probe1.supplyProbe();
        Spacecraft probe2 = new Spacecraft("sondaII", 6, 4200, 41200);
        probe2.researchProbe();
        Spacecraft repairer = new Spacecraft("Repardores", 9, 6500, 52300);
        repairer.sendRepairGroup();
        Spacecraft research = new Spacecraft("exploradorI", 11, 8200, 73502);
        research.sendResearchGroup();
    
    }

    static void menu(){
        int Option = 0;
        do {
            Option = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n1: naves creadas\n2: Salir"));
            switch (Option) {
                case 1:
                spacecraftCreated();
                menu();
                    break;

                case 2:
                JOptionPane.showMessageDialog(null, "!Hasta la Proxima¡");
                System.exit(0);  
            }



        } while (Option != 2);
            
        

    }

}
