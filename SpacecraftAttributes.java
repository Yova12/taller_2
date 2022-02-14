/**clase abstracta encargadad de los atributos de las naves espaciales
 * @author Yovanny Valderrama
 */
public abstract class SpacecraftAttributes {
    /**
     * Atributos en comun de las naves espaciales
     */
    protected String name;
    protected int motors;
    protected int push;
    protected float spped;
    
    
    public SpacecraftAttributes(String name, int motors, int push, float spped) {
        this.name = name;
        this.motors = motors;
        this.push = push;
        this.spped = spped;

    }
    /**
     * funciones prinipales de una nave
     */
    public abstract void takeOff();
    public abstract void sppedUp();
    public abstract void payloadRelease();


}
