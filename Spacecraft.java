
import javax.swing.JOptionPane;

/**clase para creacion de naves
 * @author Yovanny Valderrama
 */
public class Spacecraft extends SpacecraftAttributes implements IUnmannedSpacecraft, IMannedSpacecraft {
/**
 * constructor
 * @param name
 * @param motors
 * @param push
 * @param spped
 */
public Spacecraft(String name, int motors, int push, float spped) {
        
    super(name, motors, push, spped);
    }

/**
 * Funciones de nave espacial tripulada
 */
    @Override
    public void sendRepairGroup() {
        JOptionPane.showMessageDialog(null,
        "Tipo de nave: Grupo de reparacion "+
        "\nNombre: "+name+"\nMotores: " + motors +
        "\nEmpuje: " + push + " Toneladas" +
        "\nVelocidad: "+ spped + "k/h" );
        
    }

    @Override
    public void sendResearchGroup() {
        JOptionPane.showMessageDialog(null,
        "Tipo de nave: Grupo de investigacion "+
        "\nNombre: "+name+"\nMotores: " + motors +
        "\nEmpuje: " + push + " Toneladas" +
        "\nVelocidad: "+ spped + "k/h" );
       
    }
/**
 * funciones de nave espacial no tripulada 
 */
    @Override
    public void supplyProbe() {
        JOptionPane.showMessageDialog(null,
        "Tipo de nave: Sonda de abastecimiento "+
        "\nNombre: "+name+"\nMotores: " + motors +
        "\nEmpuje: " + push + " Toneladas" +
        "\nVelocidad: "+ spped + "k/h" );
        
    }

    @Override
    public void researchProbe() {
        JOptionPane.showMessageDialog(null,
        "Tipo de nave: Sonda investigacion "+
        "\nNombre: "+name+"\nMotores: " + motors +
        "\nEmpuje: " + push + " Toneladas" +
        "\nVelocidad: "+ spped + "k/h" );
        
    }
/**
 * funciones de abtractas de las naves
 */
    @Override
    public void takeOff() {
        JOptionPane.showMessageDialog(null, "La nave ha despegado");
        
    }

    @Override
    public void sppedUp() {
        JOptionPane.showMessageDialog(null, "La nave esta acelerando");
        
    }

    @Override
    public void payloadRelease() {
        JOptionPane.showMessageDialog(null, "La nave ha soltado su carga util");
        
    }
    
}
